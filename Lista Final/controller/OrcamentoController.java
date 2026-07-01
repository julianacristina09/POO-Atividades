package com.example.crudproject.controller;

import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.service.OrcamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping({"/orcamento", "/orcamentos"})
public class OrcamentoController {

    private final OrcamentoService orcamentoService;

    public OrcamentoController(OrcamentoService orcamentoService) {
        this.orcamentoService = orcamentoService;
    }

    @GetMapping
    public ResponseEntity<List<Orcamento>> listar() {
        return ResponseEntity.ok(orcamentoService.listar());
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Orcamento>> buscarPorStatus(@PathVariable StatusOrcamento status) {
        return ResponseEntity.ok(orcamentoService.buscarPorStatus(status));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orcamento> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(orcamentoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Orcamento> criar(@RequestBody Orcamento orcamento) {
        Orcamento orcamentoCriado = orcamentoService.criar(orcamento);
        URI uri = URI.create("/orcamento/" + orcamentoCriado.getId());
        return ResponseEntity.created(uri).body(orcamentoCriado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orcamento> atualizar(@PathVariable Long id, @RequestBody Orcamento orcamento) {
        return ResponseEntity.ok(orcamentoService.atualizar(id, orcamento));
    }

    @PutMapping("/{id}/aprovar")
    public ResponseEntity<Orcamento> aprovar(@PathVariable Long id) {
        return ResponseEntity.ok(orcamentoService.aprovar(id));
    }

    @PutMapping("/{id}/rejeitar")
    public ResponseEntity<Orcamento> rejeitar(@PathVariable Long id) {
        return ResponseEntity.ok(orcamentoService.rejeitar(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        orcamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
