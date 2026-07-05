package com.exemplo.jogovelha.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do jogador é obrigatório")
    private String nome;

    @Enumerated(EnumType.STRING)
    private Simbolo simbolo;

    public Jogador() {
    }

    public Jogador(String nome, Simbolo simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }
}
