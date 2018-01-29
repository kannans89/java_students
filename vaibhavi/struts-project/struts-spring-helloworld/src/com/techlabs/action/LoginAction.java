package com.techlabs.action;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.forms.LoginForm;
import com.techlabs.service.LoginService;

public class LoginAction extends ActionSupport implements
		ModelDriven<LoginForm> {

	private static final long serialVersionUID = 1L;

	private LoginForm loginForm;

	@Autowired
	private LoginService loginService;

	@Override
	public void validate() {
		if (StringUtils.isEmpty(loginForm.getUserName())) {
			this.addFieldError("userName", "UserName is empty");
		}
		if (StringUtils.isEmpty(loginForm.getPassword()))
			this.addFieldError("password", "Password is empty");
		loginService.validate(loginForm.getUserName(), loginForm.getPassword());
		System.out.println("In validate() method");
	}

	@Override
	public String execute() {
		System.out.println("In execute() method");
		if (loginForm.getUserName().equals("admin")
				&& loginForm.getPassword().equals("admin")) {
			return "welcome";
		}
		return INPUT;

	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	@Override
	public LoginForm getModel() {
		
			return new LoginForm();
	}

}
