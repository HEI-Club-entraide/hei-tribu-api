package com.hei.tribu.controller.converter;

import com.hei.tribu.model.exception.BadRequestException;
import com.hei.tribu.service.utils.PageSize;
import org.springframework.core.convert.converter.Converter;

public class PageSizeConverter implements Converter<String, PageSize> {

    @Override
    public PageSize convert(String source) {
        try{
            int value = Integer.parseInt(source);
            return new PageSize(value);
        }
        catch (NumberFormatException e){
            throw new BadRequestException(e.toString());
        }
    }
}
