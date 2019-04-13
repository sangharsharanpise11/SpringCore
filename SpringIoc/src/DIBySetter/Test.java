package DIBySetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DIByConstructor.Employee;

public class Test
{
	 public static void main(String[] args)
	    {  
	          
	        ApplicationContext context=new ClassPathXmlApplicationContext("EmpSetter.xml");  
	        EmployeeSetter object=(EmployeeSetter)context.getBean("obj");
	        object.toString();
            object.display();
	     }  
}
