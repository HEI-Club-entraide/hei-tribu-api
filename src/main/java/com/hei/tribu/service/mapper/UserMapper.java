package com.hei.tribu.service.mapper;

import com.hei.tribu.model.rest.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UserMapper {
    public User toRest(com.hei.tribu.model.User domain){
        return User.builder()
                .id(domain.getIdUser().toString())
                .group(domain.getGroup().getName())
                .birthdate(domain.getBirthdate())
                .email(domain.getEmail())
                .firstName(domain.getFirstName())
                .lastName(domain.getLastName())
                .gender(domain.getGender())
                .role(domain.getRole())
                .password(domain.getPassword())
                .username(domain.getUsername())
                .userProfilePicture(domain.getUserProfilePicture())
                .build();
    }
}
