package com.example.spring_boot_demo.controllers;

import com.example.spring_boot_demo.entity.UserEntity;
import com.example.spring_boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.spring_boot_demo.models.Users;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")

public class UserController {

//    public String getUsers(){
//        return "Hello Keshav";
//    }
    @Autowired          // So that Spring Boot automatically create and instantiate object inside functions of this class
    private UserRepository userRepository;

    @GetMapping
    public List<UserEntity> getUsers(){
//        return Arrays.asList(
//                new Users(1L, "Keshav", "k21keshav05@gmail.com"),
//                new Users(2L, "Sam", "Sam@gmail.com"),
//                new Users(3L, "Peter", "peter@gmail.com")
//        );
        return userRepository.findAll();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){

//        System.out.println("POST API Called !");
//        System.out.println("User Name: "+user.getName()+", User Email: "+user.getEmail());
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUserById(@PathVariable Long id){
        return userRepository.findById(id);
    }
}

