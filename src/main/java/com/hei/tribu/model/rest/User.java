package com.hei.tribu.model.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hei.tribu.model.type.Gender;
import com.hei.tribu.model.type.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class User {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Role role;
    private Gender gender;
    @JsonProperty("user_profile_picture")
    private String userProfilePicture;
    private Instant birthdate;
    private String group;
}
