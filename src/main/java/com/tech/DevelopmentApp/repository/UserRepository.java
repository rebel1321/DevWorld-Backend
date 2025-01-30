package com.tech.DevelopmentApp.repository;

import com.tech.DevelopmentApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
}
