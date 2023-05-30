package com.hei.tribu.model.rest;

import com.hei.tribu.model.type.Gender;
import com.hei.tribu.model.type.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Instant;

@AllArgsConstructor
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Role role;
    private Gender gender;
    private String userProfilePicture;
    private Instant birthdate;
    private String groupName;
}
