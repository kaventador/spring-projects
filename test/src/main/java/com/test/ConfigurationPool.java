package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationPool {

    @Bean
    Prodact prodact(){
        return new Prodact();
    }
}
