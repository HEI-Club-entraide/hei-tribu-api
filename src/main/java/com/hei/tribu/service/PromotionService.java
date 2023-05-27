package com.hei.tribu.service;

import com.hei.tribu.model.Promotion;
import com.hei.tribu.repository.PromotionRepository;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PromotionService {
    private PromotionRepository repository;

    //Get mapping
    public List<Promotion> getPromotions(Page page, PageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, pageSize.getValue());
        return repository.findAll(pageable).stream()
                .collect(Collectors.toUnmodifiableList());
    }
}
