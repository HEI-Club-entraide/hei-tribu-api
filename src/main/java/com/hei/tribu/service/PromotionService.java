package com.hei.tribu.service;

import com.hei.tribu.model.Promotion;
import com.hei.tribu.repository.PromotionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PromotionService {
    private PromotionRepository repository;

    //Get mapping
    public List<Promotion> getPromotions(){
        return repository.findAll();
    }
}
