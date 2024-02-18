package com.kasra.karsauth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.kasra.karsauth.entity.User;
public interface Userrepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
