package com.exemplo.jogovelha.model;

import jakarta.persistence.*;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador jogadorX;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador jogadorO;

    private String tabuleiro;

    @Enumerated(EnumType.STRING)
    private Simbolo turnoAtual;

    @Enumerated(EnumType.STRING)
    private StatusPartida status;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador vencedor;

    public Partida() {
    }

    public Partida(Jogador jogadorX, Jogador jogadorO) {
        this.jogadorX = jogadorX;
        this.jogadorO = jogadorO;
        this.tabuleiro = "---------";
        this.turnoAtual = Simbolo.X;
        this.status = StatusPartida.EM_ANDAMENTO;
        this.vencedor = null;
    }

    public Long getId() {
        return id;
    }

    public Jogador getJogadorX() {
        return jogadorX;
    }

    public void setJogadorX(Jogador jogadorX) {
        this.jogadorX = jogadorX;
    }

    public Jogador getJogadorO() {
        return jogadorO;
    }

    public void setJogadorO(Jogador jogadorO) {
        this.jogadorO = jogadorO;
    }

    public String getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Simbolo getTurnoAtual() {
        return turnoAtual;
    }

    public void setTurnoAtual(Simbolo turnoAtual) {
        this.turnoAtual = turnoAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public void setStatus(StatusPartida status) {
        this.status = status;
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Jogador vencedor) {
        this.vencedor = vencedor;
    }

    public char consultarPosicao(int linha, int coluna) {
        return tabuleiro.charAt(calcularIndice(linha, coluna));
    }

    public boolean posicaoLivre(int linha, int coluna) {
        return consultarPosicao(linha, coluna) == '-';
    }

    public void marcarPosicao(int linha, int coluna, Simbolo simbolo) {
        int indice = calcularIndice(linha, coluna);
        StringBuilder novoTabuleiro = new StringBuilder(tabuleiro);
        novoTabuleiro.setCharAt(indice, simbolo.name().charAt(0));
        this.tabuleiro = novoTabuleiro.toString();
    }

    public void alternarTurno() {
        this.turnoAtual = this.turnoAtual == Simbolo.X ? Simbolo.O : Simbolo.X;
    }

    public boolean estaCompleto() {
        return !tabuleiro.contains("-");
    }

    public boolean houveVitoria(Simbolo simbolo) {
        char s = simbolo.name().charAt(0);
        int[][] combinacoes = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6}
        };

        for (int[] c : combinacoes) {
            if (tabuleiro.charAt(c[0]) == s && tabuleiro.charAt(c[1]) == s && tabuleiro.charAt(c[2]) == s) {
                return true;
            }
        }
        return false;
    }

    public Jogador buscarJogadorPorSimbolo(Simbolo simbolo) {
        return simbolo == Simbolo.X ? jogadorX : jogadorO;
    }

    private int calcularIndice(int linha, int coluna) {
        return linha * 3 + coluna;
    }
}
