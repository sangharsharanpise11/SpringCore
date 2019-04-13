package Com.BridgeIt.Service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import Com.BridgeIt.Methodinterce.Bank;

public class LogAroundservice implements  MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("befor Deposit method");
		Object ret=mi.proceed();
		l.info("after Deposit method");
		
		return ret;
	}

	

}

