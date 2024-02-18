package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A classA;

    public B(){}
    @Autowired
    public B(A classA){
        this.classA = classA;
    }
    public void print(){
        System.out.println(classA.getMessage());
    }
    public A getClassA(){
        return classA;
    }
    public void setClassA(A classA){
        this.classA = classA;
    }

}
