package com.example.spring_boot_demo.entity;

import jakarta.persistence.*;

@Entity     // This annotation makes this class an entity
@Table(name = "users")  // Create a table name "users"
public class UserEntity {

    @Id     // Denotes "Primary Key" and this is a MUST-HAVE
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Auto-Increment value
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;

    public UserEntity(Long id, String name, String email, String username, String password){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserEntity(){
        super();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){ return username; }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password) { this.password = password; }


}
