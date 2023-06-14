package com.hei.tribu.model.exception;

import com.hei.tribu.model.type.ExceptionType;

public class NotImplementedException extends ApiException{
    public NotImplementedException(String message){
        super(ExceptionType.SERVER_EXCEPTION, message);
    }
}
