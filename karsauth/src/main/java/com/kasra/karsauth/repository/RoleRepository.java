package com.kasra.karsauth.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kasra.karsauth.entity.Role;
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
