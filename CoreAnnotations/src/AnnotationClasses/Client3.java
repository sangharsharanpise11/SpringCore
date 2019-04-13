package AnnotationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client3 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig1.class);
		College2 college2=(College2)context.getBean("collegeBean2");
		college2.test();

	}

}
