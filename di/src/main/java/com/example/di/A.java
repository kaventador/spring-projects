package com.example.di;

import org.springframework.stereotype.Component;

@Component
public class A {

    private String message;

    public A() {}

    public A(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
