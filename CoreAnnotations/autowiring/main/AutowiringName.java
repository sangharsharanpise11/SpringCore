package com.bridgelabz.spring.autowiring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.autowiring.model.Employee;

public class AutowiringName {

	public static void main(String[] args) { 
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee=(Employee)context.getBean("employee");
		employee.showAddress();
		System.out.println("ADDRESS DISPLAYED BY "+employee.toString() );
	}

}
