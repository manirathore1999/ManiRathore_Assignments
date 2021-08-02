package com.example.a1q3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class A1q3Application {

	public static void main(String[] args) {
//		SpringApplication.run(A1q3Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		BankAccountRepositoryImpl a = (BankAccountRepositoryImpl) context.getBean("obj3");
		System.out.println(a.getBalance(1));
	}

}
