package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {

		ApplicationContext con=new ClassPathXmlApplicationContext("springdemo.xml");
		Student student=(Student)con.getBean("student");
		student.displayStudentInfo();
		Teacher teacher=(Teacher)con.getBean("teacher");
		teacher.displayTeacherInfo();

	}

}

