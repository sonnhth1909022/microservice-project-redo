package com.orderservice.orderservice.repository;

import com.orderservice.orderservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(String id);
    Optional<User> findByUserNameAndAndPassword(String userName, String password);
}
