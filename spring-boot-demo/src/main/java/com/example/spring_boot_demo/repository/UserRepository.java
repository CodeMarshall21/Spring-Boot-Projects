package com.example.spring_boot_demo.repository;

import com.example.spring_boot_demo.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Bean
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String Username);
}
