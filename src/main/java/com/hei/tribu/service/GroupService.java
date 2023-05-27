package com.hei.tribu.service;

import com.hei.tribu.model.Group;
import com.hei.tribu.repository.GroupRepository;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository repository;

    //Get mapping
    public List<Group> getGroups(Page page, PageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue()-1, pageSize.getValue());
        return repository.findAll(pageable).stream()
                .collect(Collectors.toUnmodifiableList());
    }
}
