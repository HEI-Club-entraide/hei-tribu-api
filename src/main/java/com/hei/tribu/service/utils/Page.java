package com.hei.tribu.service.utils;

import com.hei.tribu.model.exception.BadRequestException;
import lombok.Getter;

public class Page {
    @Getter
    private Integer value;
    private Integer MIN_VALUE = 1;

    public Page(Integer value){
        if(value < 1){
            throw new BadRequestException("page must be >= to 1");
        }
        if(value == null){
            this.value = MIN_VALUE;
        }
        this.value = value;
    }
}
