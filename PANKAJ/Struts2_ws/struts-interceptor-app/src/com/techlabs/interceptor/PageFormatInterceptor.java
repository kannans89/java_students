package com.techlabs.interceptor;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PageFormatInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("In intercept()");
		setAttributes(ServletActionContext.getServletContext());
		String actionResult=ai.invoke();
		return actionResult;
	}

	public void setAttributes(ServletContext app) {
		System.out.println("In setAttributes()");
		app.setAttribute("title", "Techlabs");
		app.setAttribute("css", "css/format.css");
	}

}
