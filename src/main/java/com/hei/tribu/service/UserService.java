package com.hei.tribu.service;

import com.hei.tribu.model.User;
import com.hei.tribu.repository.UserRepository;
import com.hei.tribu.service.utils.Page;
import com.hei.tribu.service.utils.PageSize;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;

    //Get mapping
    public List<User> getUsers(Page page, PageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, pageSize.getValue());
        return repository.findAll(pageable).toList();
    }
}
