package com.example.spring_boot_demo.entity;

import jakarta.persistence.*;

@Entity     // This annotation makes this class an entity
@Table(name = "users")  // Create a table name "users"
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public UserEntity(Long id, String name, String email){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserEntity(){
        super();
    }


}
