package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.ICustomerService;

public class DeleteCustomerAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private ICustomerService deleteCustService;

	@Override
	public String execute() {
		System.out.print("In DeleteCustAction.. Deleting:");
		System.out.println(ServletActionContext.getRequest().getParameter("id"));
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		deleteCustService.delete(id);
		return "success";
	}

	public ICustomerService getDeleteCustService() {
		System.out.println("In getDeleteCustService()");
		return deleteCustService;
	}

	public void setDeleteCustService(ICustomerService deleteCustService) {
		System.out.println("In setDeleteCustService()");
		this.deleteCustService = deleteCustService;
	}

}
