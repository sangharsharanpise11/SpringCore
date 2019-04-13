package Com.BridgeIt.Client;

import org.springframework.aop.framework.ProxyFactoryBean;

import Com.BridgeIt.Method_BeforeAdvice.Bank;
import Com.BridgeIt.Service.LogBefSer;

public class Test 
{

	public static void main(String[] args)
	{
		//create Target
		Bank b =new Bank();
		//create Advice 
		LogBefSer l= new LogBefSer();
	//add advice+target to proxy
	ProxyFactoryBean pfb = new ProxyFactoryBean(); 
 	pfb.setTarget(b);
 	pfb.addAdvice(l);
 	//get genreted proxy object
 	Bank bproxy =(Bank)pfb.getObject();
 	int amount=bproxy.deposit("sbi123", 5000);
 	System.out.println(amount);
 	
		
	}
}
