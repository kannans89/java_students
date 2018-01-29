package com.techlabs.interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation ai) throws Exception {
		Object obj = ServletActionContext.getRequest().getSession().getAttribute("user");
		if (obj == null)
			return "invalidUser";
		else
			return ai.invoke();

	}

	public void destroy() {

	}

	public void init() {

	}
}
