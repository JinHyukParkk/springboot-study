package com.example.demo.client.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private String name;

    private String email;

    private int age;

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}