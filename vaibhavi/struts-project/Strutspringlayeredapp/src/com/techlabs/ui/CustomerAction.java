package com.techlabs.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.*;
import com.techlabs.service.ICustomerService;

public class CustomerAction  extends ActionSupport {
	
	private ICustomerService service;
	List<Customer> customers;
	@Override
	public String execute() {
		System.out.println("Inside execute");
		/*ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		service=context.getBean("customerservice", ICustomerService.class);
		for(Customer x:service.findAll())
		{
			System.out.println(x.getFname());
			//customers.add(x);
		}*/
		customers = service.findAll();
		return SUCCESS;
		

	}
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
