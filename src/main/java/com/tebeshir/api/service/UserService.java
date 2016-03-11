package com.tebeshir.api.service;

import com.tebeshir.api.persistence.model.User;
import com.tebeshir.api.persistence.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yeko on 04/01/16.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findOneById(Long id) {
        return userRepository.findOneById(id);
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public void create(User resource) {
        userRepository.save(resource);
    }
}