package Com.BridgeIt.AutowiringMainClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Developer;

public class AutowiringConstructor 
{

	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("Application.xml");
		Object developer=context.getBean("developer");
		System.out.println(developer.toString());
	}

}
