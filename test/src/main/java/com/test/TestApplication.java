package com.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(
		exclude = {
				DataSourceAutoConfiguration.class ,
				HibernateJpaAutoConfiguration.class
		}
)
public class TestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(TestApplication.class, args);
		Prodact prodact = context.getBean(Prodact.class);
		prodact.setName("Monitor");
		prodact.setPrice(98888);
		System.out.println(prodact.toString());
	}

}
