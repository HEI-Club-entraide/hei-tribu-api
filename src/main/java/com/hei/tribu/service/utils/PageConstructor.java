package com.hei.tribu.service.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageConstructor {
    public Pageable createPageable(Page page, PageSize pageSize) {
        Pageable result = PageRequest.of(page.getValue(), pageSize.getValue());
        if(page == null){
            return PageRequest.of(1, pageSize.getValue());
        }
        if(pageSize == null){
            return PageRequest.of(page.getValue(), 20);
        }
        if(page == null && pageSize == null){
            return PageRequest.of(1, 20);
        }
            return result;
    }
}
