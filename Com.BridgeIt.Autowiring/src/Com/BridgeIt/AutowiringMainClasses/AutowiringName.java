package Com.BridgeIt.AutowiringMainClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

public class AutowiringName {

	public static void main(String[] args) { 
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/MyWorkspace/Com.BridgeIt.Autowiring/Application.xml");
		Employee employee=(Employee)context.getBean("employee");
		employee.showAddress();
		System.out.println("ADDRESS DISPLAYED BY "+employee.toString() );
	}

}
