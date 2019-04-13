package Com.BrigdeIt.Autowiring.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BrigdeIt.Autowiring.model.Developer;



public class AutowiringConstructor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Application.xml");
		Developer developer=(Developer)context.getBean("developer");
		developer.display();
		System.out.println("Developer Language in "+developer);

	}

}
