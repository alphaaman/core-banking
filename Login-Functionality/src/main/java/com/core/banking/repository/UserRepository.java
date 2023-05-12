package com.core.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.banking.entity.User;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long	> {
    User findByUsername(String username);

	
}