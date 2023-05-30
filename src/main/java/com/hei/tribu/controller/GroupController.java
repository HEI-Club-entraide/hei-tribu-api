package com.hei.tribu.controller;

import com.hei.tribu.model.Group;
import com.hei.tribu.service.GroupService;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GroupController {
    private GroupService service;

    @GetMapping("/groups")
    public List<Group> getGroups(
            @RequestParam(name = "page", required = false)Page page,
            @RequestParam(name = "page_size", required = false)PageSize pageSize
            ){
        return service.getGroups(page, pageSize);
    }
}
