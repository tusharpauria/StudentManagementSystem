package com.example.studentmanagement.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ReportService {

    public ReportService() {

        System.out.println("ReportService Bean Created");

    }

    public void generateReport() {

        System.out.println("Student Report Generated");

    }

}
