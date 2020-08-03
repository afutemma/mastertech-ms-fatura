package com.mastertech.Fatura.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "O cartão informado não pertence ao cliente informado")
public class CartaoClienteInvalidoException extends RuntimeException {
}
