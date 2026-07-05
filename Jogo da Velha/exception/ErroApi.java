package com.exemplo.jogovelha.exception;

public record ErroApi(int status, String erro, String mensagem) {
}
