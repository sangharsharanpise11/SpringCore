import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{

	public static void main(String[] args)
	{

		ApplicationContext context=new ClassPathXmlApplicationContext("QualifierFile.xml");
	    Human human=(Human)context.getBean("human");
		human.startPumping();

	}

}
