package com.hei.tribu.controller.converter;

import com.hei.tribu.model.exception.BadRequestException;
import com.hei.tribu.service.utils.Page;
import org.springframework.core.convert.converter.Converter;

public class PageConverter implements Converter<String, Page> {

    @Override
    public Page convert(String source) {
        try{
            int value = Integer.parseInt(source);
            return new Page(value);
        }
        catch (NumberFormatException e){
            throw  new BadRequestException(e.toString());
        }
    }
}
