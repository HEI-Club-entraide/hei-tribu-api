package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;

public class ForbiddenException extends ApiException{
    public ForbiddenException(String message){
        super(ExceptionType.CLIENT_EXCEPTION, message);
    }
}
