package com.example.studentmanagement.runner;

import com.example.studentmanagement.properties.AppInfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final AppInfo appInfo;

    public StartupRunner(AppInfo appInfo) {

        this.appInfo = appInfo;

    }

    @Override
    public void run(String... args) {

        System.out.println("===== APPLICATION STARTED =====");

        appInfo.displayInfo();

        System.out.println("===============================");

    }
}
