package com.hei.tribu.controller;

import com.hei.tribu.model.Promotion;
import com.hei.tribu.service.PromotionService;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PromotionController {
    private PromotionService service;

    @GetMapping("/promotions")
    public List<Promotion> getPromotions(
            @RequestParam(name = "page", required = false)Page page,
            @RequestParam(name = "page_size", required = false)PageSize pageSize
            ){
        return service.getPromotions(page, pageSize);
    }

    @PutMapping("/promotions")
    public List<Promotion> crUpdatePromotions(@RequestBody List<Promotion> toSave){
        return service.crUpdate(toSave);
    }
}
