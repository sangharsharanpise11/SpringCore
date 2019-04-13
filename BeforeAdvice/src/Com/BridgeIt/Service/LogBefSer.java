package Com.BridgeIt.Service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import Com.BridgeIt.Method_BeforeAdvice.Bank;

public class LogBefSer implements MethodBeforeAdvice {

	public void before(Method m, Object[] param,Object o)throws Throwable
	{
		Log l = LogFactory.getLog(Bank.class);
		l.info("Deposit method");
		
	}
}