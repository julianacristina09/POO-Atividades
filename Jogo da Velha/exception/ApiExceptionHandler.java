package com.exemplo.jogovelha.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(PartidaNaoEncontradaException.class)
    public ResponseEntity<ErroApi> tratarPartidaNaoEncontrada(PartidaNaoEncontradaException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErroApi(404, "Não encontrado", ex.getMessage()));
    }

    @ExceptionHandler(PartidaEncerradaException.class)
    public ResponseEntity<ErroApi> tratarPartidaEncerrada(PartidaEncerradaException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ErroApi(409, "Conflito", ex.getMessage()));
    }

    @ExceptionHandler(JogadaInvalidaException.class)
    public ResponseEntity<ErroApi> tratarJogadaInvalida(JogadaInvalidaException ex) {
        HttpStatus status = ex.getMessage().contains("fora do intervalo") ? HttpStatus.BAD_REQUEST : HttpStatus.CONFLICT;
        return ResponseEntity.status(status)
                .body(new ErroApi(status.value(), status == HttpStatus.BAD_REQUEST ? "Requisição inválida" : "Conflito", ex.getMessage()));
    }

    @ExceptionHandler({MissingServletRequestParameterException.class, MethodArgumentTypeMismatchException.class, IllegalArgumentException.class})
    public ResponseEntity<ErroApi> tratarDadosInvalidos(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ErroApi(400, "Requisição inválida", "Dados obrigatórios ausentes ou inválidos"));
    }
}
