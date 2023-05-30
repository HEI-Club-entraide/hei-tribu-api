package com.hei.tribu.controller;

import com.hei.tribu.model.rest.User;
import com.hei.tribu.service.UserService;
import com.hei.tribu.service.mapper.UserMapper;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService service;
    private UserMapper mapper;

    @GetMapping("/users")
    public List<User> getUsers(
            @RequestParam(name = "page", required = false) Page page,
            @RequestParam(name = "page_size", required = false) PageSize pageSize){
        return service.getUsers(page, pageSize).stream()
                .map(mapper::toRest)
                .toList();
    }
}
