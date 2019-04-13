package com.bridgelabz.spring.autowiring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.autowiring.model.Developer;
import com.bridgelabz.spring.autowiring.model.Person;

public class AutowiringType {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	Person person=(Person)context.getBean("person");
	person.displayAbility();
}
}
