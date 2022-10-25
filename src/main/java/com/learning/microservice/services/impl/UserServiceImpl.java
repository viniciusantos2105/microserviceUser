package com.learning.microservice.services.impl;

import com.learning.microservice.domain.User;
import com.learning.microservice.repository.UserRepository;
import com.learning.microservice.services.UserService;
import com.learning.microservice.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new ObjectNotFoundException());
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
