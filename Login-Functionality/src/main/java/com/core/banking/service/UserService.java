package com.core.banking.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.core.banking.entity.User;

public interface UserService extends UserDetailsService {
    User registerUser(User user);
    User findByUsername(String username);
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);
}