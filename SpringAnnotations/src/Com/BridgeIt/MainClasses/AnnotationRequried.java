package Com.BridgeIt.MainClasses;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BridgeIt.Model.Student;


public class AnnotationRequried {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("App.xml");
Student student=(Com.BridgeIt.Model.Student)context.getBean("student");
System.out.println("Name: "+student.getName());



	}

}
