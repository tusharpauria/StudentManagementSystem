package com.example.studentmanagement.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {

        System.out.println("1. Constructor Called");

    }

    @PostConstruct
    public void init() {

        System.out.println("2. @PostConstruct Executed");

    }

    @PreDestroy
    public void destroy() {

        System.out.println("3. @PreDestroy Executed");

    }
}
