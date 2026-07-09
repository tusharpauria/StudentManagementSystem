package com.example.studentmanagement;

import com.example.studentmanagement.lazy.ReportService;
import com.example.studentmanagement.scope.PrototypeBean;
import com.example.studentmanagement.scope.SingletonBean;
import com.example.studentmanagement.utility.College;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.studentmanagement.controller.StudentController;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(StudentManagementSystemApplication.class, args);

		StudentController controller = context.getBean(StudentController.class);
		controller.displayStudent();

		College college = context.getBean(College.class);
		college.displayCollege();

		SingletonBean singleton1 = context.getBean(SingletonBean.class);
		SingletonBean singleton2 = context.getBean(SingletonBean.class);

		System.out.println(singleton1);
		System.out.println(singleton2);

		PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
		PrototypeBean prototype2 = context.getBean(PrototypeBean.class);

		System.out.println(prototype1);
		System.out.println(prototype2);

		ReportService  reportService = context.getBean(ReportService.class);
		reportService.generateReport();

	}

}
