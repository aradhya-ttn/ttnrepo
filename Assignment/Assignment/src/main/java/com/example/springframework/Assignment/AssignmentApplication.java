package com.example.springframework.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {

//		(4) Get a Spring Bean from application context and display its properties.
		ApplicationContext applicationContext=
		SpringApplication.run(AssignmentApplication.class, args);
		Manager manager=applicationContext.getBean(Manager.class);
		manager.myCall();
	}

}
