package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class ViewCustomerAction implements Action {

	private ICustomerService custService;
	private List<Customer> customers;

	public ViewCustomerAction() {
		System.out.println("In ViewCustAction's constr.");
	}

	@Override
	public String execute() {
		customers = custService.findAll();
		return SUCCESS;
	}

	public ICustomerService getCustService() {
		System.out.println("In getCustService() of ViewCustAction");
		return custService;
	}

	public void setCustService(ICustomerService custService) {
		System.out.println("In setCustService() of ViewCustAction");
		this.custService = custService;
	}

	public List<Customer> getCustomers() {
		System.out.println("In getCustomers() of ViewCustAction");
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		System.out.println("In setCustomers() of ViewCustAction");
		this.customers = customers;
	}

}
