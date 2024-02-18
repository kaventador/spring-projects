package com.kasra.karsauth.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import com.kasra.karsauth.dto.UserRegistrationDto;
import com.kasra.karsauth.entity.User;
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegDto);
}