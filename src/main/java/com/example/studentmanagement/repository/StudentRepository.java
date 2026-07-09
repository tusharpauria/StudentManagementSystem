package com.example.studentmanagement.repository;

import com.example.studentmanagement.model.Student;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student getStudent() {

        return new Student(101, "Tushar", "Spring Boot");

    }
}
