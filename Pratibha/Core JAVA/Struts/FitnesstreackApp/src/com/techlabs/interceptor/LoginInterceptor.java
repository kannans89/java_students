package com.techlabs.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class LoginInterceptor  extends AbstractInterceptor {

        @Override
        public String intercept(ActionInvocation invocation) throws Exception {
                Map<String, Object> session = invocation.getInvocationContext().getSession();
System.out.println("Interceptor");
                String loginId = (String) session.get("name");

                if (loginId == null) 
                {System.out.println("not login");
                        return "login";
                } 
                else 
                {System.out.println("loggedin ");
                        return invocation.invoke();
                }
        }
}