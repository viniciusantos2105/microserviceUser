package com.learning.microservice.resources.impl;

import com.learning.microservice.domain.User;
import com.learning.microservice.resources.UserResource;
import com.learning.microservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService service;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
