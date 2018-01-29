package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class UpdateCustomerAction extends ActionSupport implements
		ModelDriven<Customer> {
	private static final long serialVersionUID = 1L;
	ICustomerService updateCustService;
	Customer updateCustDTO;
	int id;

	@Override
	public String execute() {
		System.out.println("In UpdateCustAction exec()");
		if (ServletActionContext.getRequest().getMethod() == "GET") {
			id = Integer.parseInt(ServletActionContext.getRequest()
					.getParameter("id"));
			updateCustDTO = updateCustService.find(id);
			System.out.println("updateCustDTO contents "+updateCustDTO.getId()+updateCustDTO.getName()+updateCustDTO.getLocation());
			System.out.println("Returning GET from exec()");
			return "get";
		} else {
			updateCustService.update(id, updateCustDTO);
			System.out.println("Returning SUCCESS from exec()");
			return "success";
		}
	}

	public ICustomerService getUpdateCustService() {
		System.out.println("In getUpdateCustService()");
		return updateCustService;
	}

	public void setUpdateCustService(ICustomerService updateCustService) {
		System.out.println("In setUpdateCustService()");
		this.updateCustService = updateCustService;
	}

	public Customer getUpdateCustDTO() {
		System.out.println("In getUpdateCustDTO");
		return updateCustDTO;
	}

	public void setUpdateCustDTO(Customer updateCustDTO) {
		System.out.println("In setUpdateCustDTO");
		this.updateCustDTO = updateCustDTO;
	}

	@Override
	public Customer getModel() {
		System.out.println("In getModel() of UpdateCustAction");
		return updateCustDTO;
	}
}
