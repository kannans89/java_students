package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class FetchDetailsAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Autowired
	ICustomerService custService;
	List<Customer> customers;
	String name = "pankaj";

	@Override
	public String execute() {
		System.out.println("In exec..");
		customers = custService.findAll();
		return SUCCESS;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
