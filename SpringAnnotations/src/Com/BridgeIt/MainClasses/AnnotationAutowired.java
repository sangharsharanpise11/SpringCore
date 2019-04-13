package Com.BridgeIt.MainClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BridgeIt.Model.Customer;

public class AnnotationAutowired {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("App.xml");
		Customer customer=(Customer)context.getBean("customer");
		System.out.println(customer.getPerson());
		System.out.println(customer.getAction());

	}

}
