package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;

public class BadRequestException extends ApiException{
    public BadRequestException(String message){
        super(ExceptionType.CLIENT_EXCEPTION, message);
    }

    public BadRequestException(int errorType, String message){
        super(errorType, message, ExceptionType.CLIENT_EXCEPTION);
    }
}
