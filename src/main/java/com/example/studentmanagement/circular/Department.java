package com.example.studentmanagement.circular;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private final Teacher teacher;

    public Department(Teacher teacher) {

        this.teacher = teacher;

        System.out.println("Department Bean Created");

    }
}
