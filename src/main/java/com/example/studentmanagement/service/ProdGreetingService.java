package com.example.studentmanagement.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdGreetingService implements GreetingService {

    @Override
    public String getGreeting() {

        return "Hello from Production Environment";

    }
}
