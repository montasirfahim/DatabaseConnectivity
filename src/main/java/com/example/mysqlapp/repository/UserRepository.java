package com.example.mysqlapp.repository;

import com.example.mysqlapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
