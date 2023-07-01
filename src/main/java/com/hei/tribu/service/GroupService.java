package com.hei.tribu.service;

import com.hei.tribu.model.Group;
import com.hei.tribu.repository.GroupRepository;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.hei.tribu.service.utils.PageConstructor.createPageable;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository repository;

    //Get mapping
    public List<Group> getGroups(Page page, PageSize pageSize){
        return repository.findAll(createPageable(page, pageSize)).stream()
                .collect(Collectors.toUnmodifiableList());
    }

    public List<Group> crUpdate(List<Group> toSave){
        return repository.saveAll(toSave);
    }
}
