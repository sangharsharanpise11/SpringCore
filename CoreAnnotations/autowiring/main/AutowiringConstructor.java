package com.bridgelabz.spring.autowiring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.autowiring.model.Developer;

public class AutowiringConstructor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Developer developer=(Developer)context.getBean("developer");
		developer.display();
		System.out.println("Developer Language in "+developer);

	}

}
