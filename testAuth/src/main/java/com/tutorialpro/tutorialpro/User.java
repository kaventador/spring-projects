package com.tutorialpro.tutorialpro;

import org.springframework.stereotype.Component;
@Component
public class User {


    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
