package com.techlabs.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class CustomerAction extends ActionSupport
	implements ModelDriven<Customer>{

	Customer customer = new Customer();

	public String execute() throws Exception {

		return SUCCESS;

	}

	public Customer getModel() {

		return customer;

	}
}