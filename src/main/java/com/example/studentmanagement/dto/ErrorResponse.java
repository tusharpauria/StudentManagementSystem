package com.example.studentmanagement.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class ErrorResponse {

    private LocalDateTime timestamp;

    private int status;

    private String error;

    private String message;

    private Map<String, String> errors;

    public ErrorResponse(LocalDateTime timestamp, int status, String error, String message) {

        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;

    }

    public LocalDateTime getTimestamp() {

        return timestamp;

    }

    public int getStatus() {

        return status;

    }

    public String getError() {

        return error;

    }

    public String getMessage() {

        return message;

    }

    public ErrorResponse(LocalDateTime timestamp, int status, String error, Map<String, String> errors) {

        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.errors = errors;

    }

    public Map<String, String> getErrors() {

        return errors;

    }
}
