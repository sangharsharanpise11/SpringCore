package Com.BridgeIt.MainClasses;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.BridgeIt.Model.Person;


public class AutowiringType
{
public static void main(String[] args) 
{
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	Person person=(Person)context.getBean("person");
	person.displayAbility();
}
}
