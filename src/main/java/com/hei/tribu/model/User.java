package com.hei.tribu.model;

import com.hei.tribu.model.type.Gender;
import com.hei.tribu.model.type.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Group group;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private Role role;

    private Gender gender;

    private String userProfilePicture;

    private Instant birthdate;
}
