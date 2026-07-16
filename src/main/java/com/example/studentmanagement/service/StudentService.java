package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentRequest;
import com.example.studentmanagement.dto.StudentResponse;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.exception.StudentNotFoundException;
import com.example.studentmanagement.repository.StudentRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;

    }

    public StudentResponse saveStudent(StudentRequest studentRequest) {

        Student student = new Student();

        student.setName(studentRequest.getName());
        student.setEmail(studentRequest.getEmail());
        student.setAge(studentRequest.getAge());

        Student savedStudent = studentRepository.save(student);

        return new StudentResponse(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getAge(),
                savedStudent.getEmail()
        );
    }

    public List<StudentResponse> getAllStudents() {

        List<Student> students = studentRepository.findAll();

        return students.stream().map(student -> new StudentResponse(
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getEmail()))
                .collect(Collectors.toList());

    }

    public StudentResponse getStudentById(Long id) {

        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found"));

        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getEmail()
        );
    }

    public StudentResponse updateStudent(Long id, StudentRequest studentRequest) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));

        student.setName(studentRequest.getName());
        student.setEmail(studentRequest.getEmail());
        student.setAge(studentRequest.getAge());

        Student updatedStudent = studentRepository.save(student);

        return new StudentResponse(
                updatedStudent.getId(),
                updatedStudent.getName(),
                updatedStudent.getAge(),
                updatedStudent.getEmail()
        );
    }

    public void deleteStudent(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));

        studentRepository.delete(student);

    }
}
