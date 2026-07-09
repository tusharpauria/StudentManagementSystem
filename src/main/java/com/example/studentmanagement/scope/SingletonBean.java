package com.example.studentmanagement.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public  SingletonBean() {

        System.out.println("SingletonBean Created");

    }
}

