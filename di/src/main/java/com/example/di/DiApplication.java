package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {



    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);

        B classB = new B();
        classB.print();
    }

}
