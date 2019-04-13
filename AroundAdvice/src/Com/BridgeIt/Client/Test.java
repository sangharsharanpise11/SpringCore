package Com.BridgeIt.Client;

import org.springframework.aop.framework.ProxyFactoryBean;

import Com.BridgeIt.Methodinterce.Bank;
import Com.BridgeIt.Service.LogAroundservice;

public class Test {

	public static void main(String[] args) {
		//create Target
		Bank b =new Bank();
		//create Advice
		 LogAroundservice  l= new  LogAroundservice();
	//add advice+target to proxy
	ProxyFactoryBean pfb = new ProxyFactoryBean(); 
 	pfb.setTarget(b);	
 	pfb.addAdvice(l);;
 	//get genreted proxy object
 	Bank bproxy =(Bank)pfb.getObject();
 	int amount=bproxy.deposit("sbi123", 5000);
 	System.out.println(amount);
 	
		
	}
}
