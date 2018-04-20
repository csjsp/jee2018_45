package interceptor.sec;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecInterceptor extends AbstractInterceptor {

  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
    Map session=invocation.getInvocationContext().getSession();
    Object obj=session.get("username");
    if(obj==null) return "login";
    else return invocation.invoke();
  }

}
