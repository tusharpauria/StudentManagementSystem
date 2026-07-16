package com.example.studentmanagement.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        System.out.println("========== REQUEST RECEIVED ==========");
        System.out.println("Method: " + httpRequest.getMethod());
        System.out.println("URI: " + httpRequest.getRequestURI());

        String secret = httpRequest.getHeader("X-SECRET");

        if ((secret == null) || !secret.equals("springboot")) {

            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            httpResponse.getWriter().write("Unauthorized Request");

            return;

        }

        chain.doFilter(request, response);

        httpResponse.addHeader("X-App-Version", "1.0");
        httpResponse.addHeader("X-Developer", "Tushar");

        System.out.println("Status: " + httpResponse.getStatus());
        System.out.println("========== RESPONSE SENT ==========");

    }
}
