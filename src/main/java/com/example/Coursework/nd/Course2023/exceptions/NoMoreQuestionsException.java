package com.example.Coursework.nd.Course2023.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoMoreQuestionsException extends RuntimeException {
    public NoMoreQuestionsException() {
    }

    public NoMoreQuestionsException(String message) {
        super(message);
    }

    public NoMoreQuestionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreQuestionsException(Throwable cause) {
        super(cause);
    }

    public NoMoreQuestionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
