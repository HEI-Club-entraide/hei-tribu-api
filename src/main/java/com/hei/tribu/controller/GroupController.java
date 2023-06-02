package com.hei.tribu.controller;

import com.hei.tribu.model.Group;
import com.hei.tribu.service.GroupService;
import com.hei.tribu.service.mapper.GroupMapper;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class GroupController {
    private GroupService service;
    private GroupMapper mapper;

    @GetMapping("/groups")
    public List<Group> getGroups(
            @RequestParam(name = "page", required = false)Page page,
            @RequestParam(name = "page_size", required = false)PageSize pageSize
            ){
        return service.getGroups(page, pageSize);
    }

    @PutMapping("/groups")
    public List<Group> crUpdate(@RequestBody List<com.hei.tribu.model.rest.Group> toSave){
        List<Group> groupsToSave = toSave.stream()
                .map(mapper::toDomain)
                .collect(Collectors.toUnmodifiableList());
        return service.crUpdate(groupsToSave);
    }
}
