package com.example.spring_boot_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @GetMapping("/home")
    public String getHomePage(){
        return "✨ Server is up and running! Welcome ✨";
    }
}
