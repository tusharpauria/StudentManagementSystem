package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.service.StudentService;

import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;

        System.out.println("StudentController Bean Created");

    }

    public void displayStudent() {

        Student student = studentService.getStudent();

        System.out.println(student);

    }
}
