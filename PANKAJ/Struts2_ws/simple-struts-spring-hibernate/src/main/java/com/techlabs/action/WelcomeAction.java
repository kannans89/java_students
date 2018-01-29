package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.demo.service.LoginService;
import com.techlabs.service.ICustomerService;

@Component
public class WelcomeAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	ICustomerService customerService;
	@Autowired
	LoginService loginService;
	
	public WelcomeAction() {
		System.out.println("welcome action created !!");
	}
	
	public String execute() {
		System.out.println(customerService);
		System.out.println("inside execute method");
		System.out.println(customerService.findAll().get(0).getFirstname());
		loginService.insert();
		return "welcome";
	}

}
