package com.hei.tribu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "\"group\"")
public class Group {
    @Id
    @GeneratedValue
    private UUID idGroup;

    @ManyToOne
    private Promotion promotion;

    private String name;

    private String groupPicture;
}
