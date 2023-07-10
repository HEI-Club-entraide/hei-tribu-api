package com.hei.tribu.model.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Group {
    private String id;
    private String promotion;
    private String name;
    private String groupPicture;
}
