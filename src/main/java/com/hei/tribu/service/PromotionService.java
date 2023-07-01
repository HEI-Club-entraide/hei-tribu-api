package com.hei.tribu.service;

import com.hei.tribu.model.Promotion;
import com.hei.tribu.repository.PromotionRepository;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageConstructor;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.hei.tribu.service.utils.PageConstructor.createPageable;

@Service
@AllArgsConstructor
public class PromotionService {
    private PromotionRepository repository;

    //Get mapping
    public List<Promotion> getPromotions(Page page, PageSize pageSize){
        return repository.findAll(createPageable(page, pageSize)).stream()
                .collect(Collectors.toUnmodifiableList());
    }

    //Put mapping
    public List<Promotion> crUpdate(List<Promotion> toSave){
        return repository.saveAll(toSave);
    }
}
