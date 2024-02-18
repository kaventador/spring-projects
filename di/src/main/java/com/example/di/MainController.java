package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    public final B classB;

    @Autowired
    public MainController(B classB) {
        this.classB = classB;
    }

    @RequestMapping("/")
    public String print(){
        classB.print();
        return "";
    }

}
