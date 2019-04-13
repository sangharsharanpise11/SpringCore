package CollectionClasses;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawpoint
{

	public static void main(String[] args) 
	{
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
		
		 Triangle triangle=(Triangle)context.getBean("triangle");
		 triangle.draw();

	}

}
