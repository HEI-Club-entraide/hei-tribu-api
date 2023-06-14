package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;
import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException{
    @Getter
    private ExceptionType type;

    public ApiException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public ApiException(int errorType, String message, ExceptionType type){
        super(HttpStatus.valueOf(errorType) + " : " + message);
        this.type = type;
    }
}
