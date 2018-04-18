package interceptor;

import java.util.Date;

import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import controller.MyAction;
import org.slf4j.*;
public class AssignDateInterceptor extends AbstractInterceptor {
  private final static Logger logger=LoggerFactory.getLogger(AssignDateInterceptor.class);
  @Override
  public String intercept(ActionInvocation invocation) throws Exception {    
    MyAction action=(MyAction)invocation.getAction();
    action.setDate(new Date());
    logger.info(""+action.getDate());
    return invocation.invoke();
  }

}
