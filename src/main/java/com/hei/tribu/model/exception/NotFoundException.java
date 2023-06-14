package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;

public class NotFoundException extends ApiException{
    public NotFoundException(String message){
        super(ExceptionType.CLIENT_EXCEPTION, message);
    }

    public NotFoundException(int errorType, String message){
        super(errorType, message, ExceptionType.CLIENT_EXCEPTION);
    }
}
