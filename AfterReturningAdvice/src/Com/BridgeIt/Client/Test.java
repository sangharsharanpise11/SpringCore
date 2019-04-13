package Com.BridgeIt.Client;

import org.springframework.aop.framework.ProxyFactoryBean;

import Com.BridgeIt.MethodAfterService.Bank;
import Com.BridgeIt.Service.LogAftSer;

public class Test 
{
 public static void main(String[] args) 
	{
		//create Target
		Bank b =new Bank();
		//create Advice
		 LogAftSer  l= new LogAftSer();
	//add advice+target to proxy
	ProxyFactoryBean pfb = new ProxyFactoryBean(); 
 	pfb.setTarget(b);	
 	pfb.addAdvice(l);
 	//get generated proxy object
 	Bank bproxy =(Bank)pfb.getObject();
 	int amount=bproxy.deposit("sbi123", 5000);
 	System.out.println(amount);
 	
		
	}
}
