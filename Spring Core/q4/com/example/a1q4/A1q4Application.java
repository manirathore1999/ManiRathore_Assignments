package com.example.a1q4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class A1q4Application {

	public static void main(String[] args) {
		SpringApplication.run(A1q4Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(A1q4Application.class, args);
		BankAccountRepositoryImpl accountRepositoryImpl = context.getBean(BankAccountRepositoryImpl.class);
		System.out.println(accountRepositoryImpl.getBalance(1));

	}

}
