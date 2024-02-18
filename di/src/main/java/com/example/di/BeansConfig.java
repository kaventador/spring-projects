package com.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {

    @Bean
    @Primary
    public A classABean(){
        return new A("Hello Beans");
    }
    @Bean
    @Primary
    public A classABean2(){
        return new A("Hello2 Beans");
    }
    @Bean
    @Primary
    public A classABean3(){
        return new A("Hello3 Beans");
    }

}
