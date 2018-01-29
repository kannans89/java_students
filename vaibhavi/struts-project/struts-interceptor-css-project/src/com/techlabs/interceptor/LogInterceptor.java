package com.techlabs.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LogInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Before action executes");
		HttpServletRequest req=ServletActionContext.getRequest(); 
		req.setAttribute("title", "Hello world");
		req.setAttribute("css", "<link rel='stylesheet' href='/WEB-INF/jsp/color.css'>");
		String actionResult=ai.invoke();
		/*System.out.println(actionResult);
		System.out.println("After action executes")*/;
		
		
		return actionResult;
	}

}
