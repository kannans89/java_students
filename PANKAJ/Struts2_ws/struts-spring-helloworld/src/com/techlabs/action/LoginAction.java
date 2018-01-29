package com.techlabs.action;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.forms.LoginForm;

public class LoginAction extends ActionSupport implements
		ModelDriven<LoginForm> {

	private static final long serialVersionUID = 1L;

	private LoginForm loginForm;

	@Override
	public void validate() {

		if (StringUtils.isEmpty(loginForm.getUserName())) {
			this.addFieldError("userName", "UserName is empty");
		}
		if (StringUtils.isEmpty(loginForm.getPassword()))
			this.addFieldError("password", "Password is empty");

		System.out.println("In validate() method");
	}

	@Override
	public String execute() {
		System.out.println("In execute() method");
		return SUCCESS;
	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	@Override
	public LoginForm getModel() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		loginForm = app.getBean("user", LoginForm.class);
		return loginForm;
	}
}
