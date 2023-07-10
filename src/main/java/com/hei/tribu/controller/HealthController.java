package com.hei.tribu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/hei")
    public String heiTribu(){
        return "tribu";
    }
}
