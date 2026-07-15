package com.example.studentmanagement.controller;

import com.example.studentmanagement.dto.StudentRequest;
import com.example.studentmanagement.dto.StudentResponse;
import com.example.studentmanagement.service.StudentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;

    }

    @PostMapping
    public StudentResponse saveStudent(@RequestBody StudentRequest studentRequest) {

        return studentService.saveStudent(studentRequest);

    }

    @GetMapping
    public List<StudentResponse> getAllStudents() {

        return studentService.getAllStudents();

    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);

    }

    @PutMapping("/{id}")
    public StudentResponse updateStudent(
            @PathVariable Long id,
            @RequestBody StudentRequest studentRequest) {

        return studentService.updateStudent(id, studentRequest);

    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);

        return "Student deleted successfully.";

    }

}
