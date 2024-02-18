package com.tutorialpro.tutorialpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void persist() {
        jdbcTemplate.update("INSERT INTO products (id,name,price) VALUES (?,?,?)",
                1, "ram", 10000
        );

    }
}

