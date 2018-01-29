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

	public FetchDetailsAction() {
		System.out.println("In action's constructor");
	}

	@Override
	public String execute() {
		System.out.println("In exec..");
		customers = custService.findAll();
		return SUCCESS;
	}

	public List<Customer> getCustomers() {
		System.out.println("In action's getCust..");
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		System.out.println("In action's setCust..");
		this.customers = customers;
	}

	public void setCustService(ICustomerService custService) {
		System.out.println("In action's setCustService()");
		this.custService = custService;
	}

	public ICustomerService getCustService() {
		System.out.println("In action's getCustService()");
		return custService;
	}

}
