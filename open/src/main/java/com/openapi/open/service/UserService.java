package com.openapi.open.service;

import com.openapi.open.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Integer id);
    List<User> findByName(String name);
    List<User> findByContact(String contact);
}
