package com.exemplo.jogovelha.exception;

public class PartidaNaoEncontradaException extends RuntimeException {
    public PartidaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
