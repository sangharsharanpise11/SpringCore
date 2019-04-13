package Com.BrigdeIt.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import Com.BrigdeIt.Business.Bank;

public class LogInException implements ThrowsAdvice{
public void afterThrowing(Exception ex)
{
Log l=LogFactory.getLog(Bank.class);
l.info("before"+ex.getMessage());
}
}
