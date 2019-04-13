package Com.BrigdeIt.Autowiring.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowiringName {

	public static void main(String[] args) { 
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Com.BrigdeIt.Autowiring.model.Employee employee=(Com.BrigdeIt.Autowiring.model.Employee)context.getBean("employee");
		employee.showAddress();
		System.out.println("ADDRESS DISPLAYED BY "+employee.toString() );
	}

}
