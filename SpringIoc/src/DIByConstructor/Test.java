package DIByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	
	    public static void main(String[] args)
	    {  
	          
	        ApplicationContext context=new ClassPathXmlApplicationContext("Emp.xml");  
	        Employee object=(Employee)context.getBean("e");
	        object.show();
      
	     }  
	}  

