package com.hei.tribu.service.utils;

import com.hei.tribu.model.exception.BadRequestException;
import lombok.Getter;

public class PageSize {
    @Getter
    private Integer value;
    private Integer MAX_VALUE = 500;
    private Integer MIN_VALUE = 1;

    public PageSize(Integer value){
        if(value < 0){
            throw new BadRequestException("page_size must be >= 1");
        }
        if(value > MAX_VALUE){
            throw new BadRequestException("page_size must be < " + MAX_VALUE);
        }
        this.value = value;
    }
}
