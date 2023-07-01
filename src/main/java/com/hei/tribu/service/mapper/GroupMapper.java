package com.hei.tribu.service.mapper;

import com.hei.tribu.model.Group;
import com.hei.tribu.repository.PromotionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@AllArgsConstructor
@Component
public class GroupMapper {
    PromotionRepository promotionRepository;

    public Group toDomain(com.hei.tribu.model.rest.Group data){
        return Group.builder()
                .groupPicture(data.getGroupPicture())
                .promotion(promotionRepository.findById(UUID.fromString(data.getPromotion())).get())
                .name(data.getName())
                .build();
    }
}
