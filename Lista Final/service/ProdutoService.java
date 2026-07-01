package com.example.crudproject.service;

import com.example.crudproject.exception.RecursoNaoEncontradoException;
import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Produto com id " + id + " nao encontrado."));
    }

    public Produto criar(Produto produto) {
        validarProduto(produto);
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto dadosAtualizados) {
        validarProduto(dadosAtualizados);

        Produto produtoExistente = buscarPorId(id);
        produtoExistente.setNome(dadosAtualizados.getNome());
        produtoExistente.setPreco(dadosAtualizados.getPreco());

        return produtoRepository.save(produtoExistente);
    }

    public void deletar(Long id) {
        Produto produto = buscarPorId(id);
        produtoRepository.delete(produto);
    }

    private void validarProduto(Produto produto) {
        if (produto == null) {
            throw new ValidacaoException("Os dados do produto devem ser informados.");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new ValidacaoException("O nome do produto nao pode ser vazio.");
        }

        if (produto.getPreco() <= 0) {
            throw new ValidacaoException("O preco do produto deve ser maior que zero.");
        }
    }
}
