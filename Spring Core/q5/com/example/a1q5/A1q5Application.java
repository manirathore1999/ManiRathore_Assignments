package com.example.a1q5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class A1q5Application {

	public static void main(String[] args) {
//		SpringApplication.run(A1q5Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Customer obj = (Customer) context.getBean("customer");
		obj.display();
	}

}
