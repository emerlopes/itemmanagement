package br.com.emerlopes.itemmanagement.application.exceptions;

import javax.naming.AuthenticationException;

public class InvalidLoginException extends AuthenticationException {

    public InvalidLoginException(String message) {
        super(message);
    }
}