package com.example.a1q8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {

	public ComponentJdbcConnection() {
		System.out.println("In ComponentJdbcConnection");
	}
	
	
	@PostConstruct
	public void postCon() {
		System.out.println("In post construt ComponentJdbcConnection");
	}
	
	@PreDestroy
	public void  destroy() {
		System.out.println("In pre destroy ComponentJdbcConnection - destroy");
	}
}
