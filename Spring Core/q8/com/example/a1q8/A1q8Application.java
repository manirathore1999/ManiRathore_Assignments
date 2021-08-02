package com.example.a1q8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class A1q8Application {

	public static void main(String[] args) {
		SpringApplication.run(A1q8Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(A1q8Application.class, args);
		ComponentJdbcConnection componentJdbcConnection = context.getBean(ComponentJdbcConnection.class);
	}

}
