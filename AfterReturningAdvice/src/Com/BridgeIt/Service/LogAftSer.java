package Com.BridgeIt.Service;

import java.lang.reflect.Method;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogAftSer implements AfterReturningAdvice 
{
	//public void afterReturning(Object o ,Method m, Object[] param,Object ret)throws Throwable
	public void afterReturning(Object ret ,Method m, Object[] param,Object o)throws Throwable
	{
		Log l = LogFactory.getLog(Com.BridgeIt.MethodAfterService.Bank.class);
		l.info("Deposit method"+ret);
		 

}
}
