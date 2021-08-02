package com.example.a1q2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class A1q2Application {

	public static void main(String[] args) {
//		SpringApplication.run(A1q2Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		QuestionList question1 = (QuestionList) context.getBean("QuestionList");
	    System.out.println(question1);
	    
		QuestionMap question2 = (QuestionMap) context.getBean("QuestionMap");
	    System.out.println(question2);
	    
	    QuestionSet question3 = (QuestionSet) context.getBean("QuestionSet");
	    System.out.println(question3);
	}

}
