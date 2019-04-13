package CollectionClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springStudent.xml");
		
		College college=(College)context.getBean("studentdetails");
		System.out.println(college);

	}

}
