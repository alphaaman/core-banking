package com.core.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.banking.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByusername(String username);

	
}