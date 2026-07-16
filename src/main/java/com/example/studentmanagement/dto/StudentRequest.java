package com.example.studentmanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class StudentRequest {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Positive(message = "Age must be greater than 0")
    private int age;

    @Email(message = "Please enter a valid email")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    public StudentRequest(String name, int age, String email) {

        this.name = name;
        this.age = age;
        this.email = email;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }
}
