package com.hei.tribu.conf.security.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AuthentificationRequest {
    private String email;
    private String password;
}
