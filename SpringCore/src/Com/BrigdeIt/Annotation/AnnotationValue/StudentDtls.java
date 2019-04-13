package Com.BrigdeIt.Annotation.AnnotationValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {

		ApplicationContext con=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/MyWorkspace/SpringCore/springvalue.xml");
		Student student=(Student)con.getBean("student");
		student.displayStudentInfo();
		Teacher teacher=(Teacher)con.getBean("teacher");
		teacher.displayTeacherInfo();

	}

}
