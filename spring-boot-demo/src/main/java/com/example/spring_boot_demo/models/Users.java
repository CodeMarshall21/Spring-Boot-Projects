package com.example.spring_boot_demo.models;

public class Users {
    private Long id;
    private String name;
    private String emailId;

    public Users(Long id, String name, String emailId){
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmailId(){
        return emailId;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }



}
