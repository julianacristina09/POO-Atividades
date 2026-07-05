package com.exemplo.jogovelha.service;

import com.exemplo.jogovelha.exception.JogadaInvalidaException;
import com.exemplo.jogovelha.exception.PartidaEncerradaException;
import com.exemplo.jogovelha.exception.PartidaNaoEncontradaException;
import com.exemplo.jogovelha.model.Jogador;
import com.exemplo.jogovelha.model.Partida;
import com.exemplo.jogovelha.model.Simbolo;
import com.exemplo.jogovelha.model.StatusPartida;
import com.exemplo.jogovelha.repository.PartidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public Partida criar(String nomeJogadorX, String nomeJogadorO) {
        validarNome(nomeJogadorX, "jogador X");
        validarNome(nomeJogadorO, "jogador O");

        Jogador jogadorX = new Jogador(nomeJogadorX, Simbolo.X);
        Jogador jogadorO = new Jogador(nomeJogadorO, Simbolo.O);
        Partida partida = new Partida(jogadorX, jogadorO);

        return partidaRepository.save(partida);
    }

    public List<Partida> listar() {
        return partidaRepository.findAll();
    }

    public Partida buscarPorId(Long id) {
        return partidaRepository.findById(id)
                .orElseThrow(() -> new PartidaNaoEncontradaException("Partida não encontrada"));
    }

    public Partida jogar(Long id, Simbolo simbolo, int linha, int coluna) {
        Partida partida = buscarPorId(id);

        validarPartidaEmAndamento(partida);
        validarTurno(partida, simbolo);
        validarLinhaColuna(linha, coluna);
        validarPosicaoLivre(partida, linha, coluna);

        partida.marcarPosicao(linha, coluna, simbolo);

        if (partida.houveVitoria(simbolo)) {
            partida.setStatus(StatusPartida.VITORIA);
            partida.setVencedor(partida.buscarJogadorPorSimbolo(simbolo));
        } else if (partida.estaCompleto()) {
            partida.setStatus(StatusPartida.EMPATE);
        } else {
            partida.alternarTurno();
        }

        return partidaRepository.save(partida);
    }

    public void excluir(Long id) {
        Partida partida = buscarPorId(id);
        partidaRepository.delete(partida);
    }

    private void validarNome(String nome, String jogador) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do " + jogador + " é obrigatório");
        }
    }

    private void validarPartidaEmAndamento(Partida partida) {
        if (partida.getStatus() != StatusPartida.EM_ANDAMENTO) {
            throw new PartidaEncerradaException("Não é permitido jogar em uma partida encerrada");
        }
    }

    private void validarTurno(Partida partida, Simbolo simbolo) {
        if (partida.getTurnoAtual() != simbolo) {
            throw new JogadaInvalidaException("Não é a vez do jogador informado");
        }
    }

    private void validarLinhaColuna(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            throw new JogadaInvalidaException("Linha ou coluna fora do intervalo de 0 a 2");
        }
    }

    private void validarPosicaoLivre(Partida partida, int linha, int coluna) {
        if (!partida.posicaoLivre(linha, coluna)) {
            throw new JogadaInvalidaException("A posição informada já está ocupada");
        }
    }
}
