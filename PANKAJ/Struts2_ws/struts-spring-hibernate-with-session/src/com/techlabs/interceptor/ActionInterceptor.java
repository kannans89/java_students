package com.techlabs.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ActionInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		Object obj = ServletActionContext.getRequest().getSession()
				.getAttribute("user");
		if (obj == null)
			return "invalidUser";
		else
			return ai.invoke();

	}

}
