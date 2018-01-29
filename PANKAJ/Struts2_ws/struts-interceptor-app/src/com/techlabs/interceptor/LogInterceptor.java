package com.techlabs.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LogInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Before invoke " + new Date());
		String actionResult = ai.invoke();
		System.out.println("After invoke " + new Date());
		return actionResult;
	}

}
