package Com.BridgeIt.MainClasses;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BridgeIt.Model.Developer;



public class AutowiringConstructor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Developer developer=(Developer)context.getBean("developer");
		developer.display();
		System.out.println("Developer Language in "+developer);

	}

}
