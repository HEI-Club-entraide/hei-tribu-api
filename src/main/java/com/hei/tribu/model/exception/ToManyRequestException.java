package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;

public class ToManyRequestException extends ApiException{
    public ToManyRequestException(String message){
        super(ExceptionType.CLIENT_EXCEPTION, message);
    }
}
