package com.learning.microservice.services;

import com.learning.microservice.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
