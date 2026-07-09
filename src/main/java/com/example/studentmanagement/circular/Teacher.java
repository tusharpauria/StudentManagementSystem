package com.example.studentmanagement.circular;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    private final Department department;

    public  Teacher(@Lazy Department department) {

        this.department = department;

        System.out.println("Teacher Bean Created");

    }
}
