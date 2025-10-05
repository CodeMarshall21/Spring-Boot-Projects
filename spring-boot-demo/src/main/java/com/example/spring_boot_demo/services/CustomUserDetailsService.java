package com.example.spring_boot_demo.services;

import com.example.spring_boot_demo.entity.UserEntity;
import com.example.spring_boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.swing.text.html.Option;
import java.util.Optional;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUserName(String username) throws UsernameNotFoundException{

        UserEntity user = userRepository.findByUsername(username).orElseThrow;


    }


}
