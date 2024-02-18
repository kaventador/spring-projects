package com.tutorialpro.tutorialpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

@SpringBootApplication
@EnableAutoConfiguration(
		exclude = {
				HibernateJpaAutoConfiguration.class
		}
)

public class TestAuthApplication implements CommandLineRunner {
	@Autowired
	ProductDao productDao;
	public static void main(String[] args) {
		SpringApplication.run(TestAuthApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		productDao.persist();
	}
}
