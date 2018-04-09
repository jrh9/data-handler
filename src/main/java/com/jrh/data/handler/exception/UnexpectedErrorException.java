package com.jrh.data.handler.exception;

import javax.ws.rs.core.Response;

public class UnexpectedErrorException extends RuntimeException {
    public UnexpectedErrorException() {
        super();
    }

    public UnexpectedErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedErrorException(String message) {
        super(message);
    }

    public UnexpectedErrorException(Throwable cause) {
        super(cause);
    }
}
