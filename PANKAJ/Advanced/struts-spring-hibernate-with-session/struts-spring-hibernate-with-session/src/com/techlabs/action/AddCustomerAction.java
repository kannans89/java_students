package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class AddCustomerAction extends ActionSupport implements
		ModelDriven<Customer> {

	private static final long serialVersionUID = 1L;
	ICustomerService customerService;
	private Customer custDTO;

	public AddCustomerAction() {
		System.out.println("In AddCustAction constr.");
	}

	@Override
	public String execute() {
		System.out.println("In AddCustAction exec()");
		System.out.println(ServletActionContext.getRequest().getMethod());
		if (ServletActionContext.getRequest().getMethod() == "GET") {
			System.out.println("Returning GET from exec()");
			return "get";
		} else if (ServletActionContext.getRequest().getMethod() == "POST") {
			System.out.println("Returning POST from exec()");
			customerService.add(custDTO);
			return "post";
		}
		return "unknown";
	}

	public ICustomerService getCustomerService() {
		System.out.println("In getCustomerService() of AddCustAction");
		return customerService;
	}

	public void setCustomerService(ICustomerService customerService) {
		System.out.println("In setCustomerService() of AddCustAction");
		this.customerService = customerService;
	}

	public Customer getCustDTO() {
		System.out.println("In getCustDTO() of AddCustAction");
		return custDTO;
	}

	public void setCustDTO(Customer custDTO) {
		System.out.println("In setCustDTO() of AddCustAction");
		this.custDTO = custDTO;
	}

	@Override
	public Customer getModel() {
		System.out.println("In getModel() of AddCustAction");
		return custDTO;
	}
}
