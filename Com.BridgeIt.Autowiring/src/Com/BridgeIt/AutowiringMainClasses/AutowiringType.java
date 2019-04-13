package Com.BridgeIt.AutowiringMainClasses;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;


public class AutowiringType
{
public static void main(String[] args)
{
	ApplicationContext context= new ClassPathXmlApplicationContext("file:/home/admin1/Documents/MyWorkspace/Com.BridgeIt.Autowiring/Application.xml");
	Person person=(Person)context.getBean("person");
	person.displayAbility();
}
}
