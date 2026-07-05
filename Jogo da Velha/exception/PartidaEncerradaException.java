package com.exemplo.jogovelha.exception;

public class PartidaEncerradaException extends RuntimeException {
    public PartidaEncerradaException(String mensagem) {
        super(mensagem);
    }
}
