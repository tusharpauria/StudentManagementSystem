package com.example.studentmanagement.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {

    @Value("${college.name}")
    private String collegeName;

    @Value("${college.city}")
    private String collegeCity;

    @Value("${student.default-name}")
    private String studentName;

    @Value("${student.default-course}")
    private String course;

    public void displayInfo() {

        System.out.println("College: " + collegeName);
        System.out.println("City: " + collegeCity);
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + course);

    }
}