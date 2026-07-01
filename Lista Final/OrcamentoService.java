package com.example.crudproject.service;

import com.example.crudproject.exception.RecursoNaoEncontradoException;
import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Cliente;
import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.Produto;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.repository.OrcamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrcamentoService {

    private final OrcamentoRepository orcamentoRepository;
    private final ClienteService clienteService;
    private final ProdutoService produtoService;

    public OrcamentoService(OrcamentoRepository orcamentoRepository,
                            ClienteService clienteService,
                            ProdutoService produtoService) {
        this.orcamentoRepository = orcamentoRepository;
        this.clienteService = clienteService;
        this.produtoService = produtoService;
    }

    public List<Orcamento> listar() {
        return orcamentoRepository.findAll();
    }

    public Orcamento buscarPorId(Long id) {
        return orcamentoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Orcamento com id " + id + " nao encontrado."));
    }

    public List<Orcamento> buscarPorStatus(StatusOrcamento status) {
        return orcamentoRepository.findByStatus(status);
    }

    public Orcamento criar(Orcamento orcamento) {
        validarOrcamento(orcamento);
        definirRelacoesComObjetosDoBanco(orcamento);
        return orcamentoRepository.save(orcamento);
    }

    public Orcamento atualizar(Long id, Orcamento dadosAtualizados) {
        validarOrcamento(dadosAtualizados);

        Orcamento orcamentoExistente = buscarPorId(id);
        orcamentoExistente.setDescricao(dadosAtualizados.getDescricao());
        orcamentoExistente.setCliente(buscarClienteInformado(dadosAtualizados));
        orcamentoExistente.setProdutos(buscarProdutosInformados(dadosAtualizados));

        return orcamentoRepository.save(orcamentoExistente);
    }

    public Orcamento aprovar(Long id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.aprovar();
        return orcamentoRepository.save(orcamento);
    }

    public Orcamento rejeitar(Long id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.rejeitar();
        return orcamentoRepository.save(orcamento);
    }

    public void deletar(Long id) {
        Orcamento orcamento = buscarPorId(id);
        orcamentoRepository.delete(orcamento);
    }

    private void validarOrcamento(Orcamento orcamento) {
        if (orcamento == null) {
            throw new ValidacaoException("Os dados do orcamento devem ser informados.");
        }

        if (orcamento.getCliente() == null || orcamento.getCliente().getId() == null) {
            throw new ValidacaoException("Um orcamento deve possuir um cliente valido.");
        }

        if (orcamento.getProdutos() == null || orcamento.getProdutos().isEmpty()) {
            throw new ValidacaoException("Um orcamento deve possuir pelo menos um produto.");
        }

        boolean algumProdutoSemId = orcamento.getProdutos().stream()
                .anyMatch(produto -> produto == null || produto.getId() == null);

        if (algumProdutoSemId) {
            throw new ValidacaoException("Informe o id de todos os produtos do orçamento.");
        }
    }

    private void definirRelacoesComObjetosDoBanco(Orcamento orcamento) {
        orcamento.setCliente(buscarClienteInformado(orcamento));
        orcamento.setProdutos(buscarProdutosInformados(orcamento));
    }

    private Cliente buscarClienteInformado(Orcamento orcamento) {
        return clienteService.buscarPorId(orcamento.getCliente().getId());
    }

    private List<Produto> buscarProdutosInformados(Orcamento orcamento) {
        return orcamento.getProdutos().stream()
                .map(produto -> produtoService.buscarPorId(produto.getId()))
                .toList();
    }
}
