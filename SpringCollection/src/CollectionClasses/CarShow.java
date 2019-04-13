package CollectionClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShow
{

	public static void main(String[] args)
	{
		

		ApplicationContext context=new ClassPathXmlApplicationContext("springCar.xml");
		ShowRoom show=(ShowRoom)context.getBean("carwale");
		System.out.println(show);
	//	 show.show();
		 

	}

}
