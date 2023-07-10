package com.hei.tribu.service.mapper;

import com.hei.tribu.model.rest.User;
import com.hei.tribu.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@AllArgsConstructor
@Component
public class UserMapper {
    GroupRepository groupRepository;
    public User toRest(com.hei.tribu.model.User domain){
        return User.builder()
                .id(domain.getId().toString())
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

    public com.hei.tribu.model.User toDomain(User data){
        return com.hei.tribu.model.User.builder()
                .group(groupRepository.findById(UUID.fromString(data.getGroup())).get())
                .role(data.getRole())
                .gender(data.getGender())
                .password(data.getPassword())
                .userProfilePicture(data.getUserProfilePicture())
                .username(data.getUsername())
                .lastName(data.getLastName())
                .email(data.getEmail())
                .build();
    }
}
