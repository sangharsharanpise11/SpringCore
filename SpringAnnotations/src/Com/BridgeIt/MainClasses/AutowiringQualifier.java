package Com.BridgeIt.MainClasses;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BridgeIt.Model.Profile;



public class AutowiringQualifier {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("App.xml");
		Profile profile=(Profile)context.getBean("profile");
		profile.printName();
		profile.printAge();

	}

}
