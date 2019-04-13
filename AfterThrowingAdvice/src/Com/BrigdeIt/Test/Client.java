package Com.BrigdeIt.Test;

import org.springframework.aop.framework.ProxyFactoryBean;

import Com.BrigdeIt.Business.Bank;
import Com.BrigdeIt.Service.LogInException;


public class Client
{

	public static void main(String[] args) 
	{
		//create Target
		Com.BrigdeIt.Business.Bank b =new Bank();
		
		//create Advice
		LogInException lexs=new LogInException();
	    //add advice+target to proxy
	    ProxyFactoryBean pfb = new ProxyFactoryBean(); 
 	    pfb.setTarget(b);	
 	    pfb.addAdvice(lexs);;
 	    //get genreted proxy object
 	    Bank bproxy =(Bank) pfb.getObject();
 	    int amount=bproxy.deposit("sbi12345", 5000);
 	    System.out.println(amount);
 	
		
	}
}

