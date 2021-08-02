package com.example.a1q9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class A1q9Application {

	public static void main(String[] args) {
//		SpringApplication.run(A1q9Application.class, args);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.close();

	}

}
