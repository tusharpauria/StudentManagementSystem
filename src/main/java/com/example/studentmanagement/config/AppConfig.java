package com.example.studentmanagement.config;

import com.example.studentmanagement.utility.College;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public College college() {

        return new College();

    }
}
