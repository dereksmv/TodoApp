package com.todoapp.todoapp.models;

public class JSONResponse {

    public JSONResponse(String message) {
        this.message = message;
    }
    public String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}