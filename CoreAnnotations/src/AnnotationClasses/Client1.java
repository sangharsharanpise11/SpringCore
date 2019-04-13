package AnnotationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client1
{

	public static void main(String[] args) 
	{
	
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College1 college1=(College1)context.getBean("collegeBean1");
		college1.displayCollegeInfo();
	}

}
