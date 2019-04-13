package com.bridgelabz.AnnotationValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springValue1.xml");
		Student student=(Student)context.getBean("student");
		student.displayStudentInfo();
		Teacher teacher=(Teacher)context.getBean("teacher");
		teacher.displayTeacherInfo();

	}

}
