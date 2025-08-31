package com.example.spring_boot_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_demo.models.Users;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {

//    public String getUsers(){
//        return "Hello Keshav";
//    }

    @GetMapping
    public List<Users> getUsers(){
        return Arrays.asList(
                new Users(1L, "Keshav", "k21keshav05@gmail.com"),
                new Users(2L, "Sam", "Sam@gmail.com"),
                new Users(3L, "Peter", "peter@gmail.com")
        );
    }
}
