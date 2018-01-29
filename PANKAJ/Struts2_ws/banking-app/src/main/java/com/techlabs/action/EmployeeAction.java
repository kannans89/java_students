package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.form.EmployeeForm;
import com.techlabs.action.form.UserForm;
import com.techlabs.entities.Contact;
import com.techlabs.exceptions.BankingException;
import com.techlabs.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements ModelDriven<EmployeeForm> {

	private static final long serialVersionUID = 1L;

	@Autowired
	EmployeeService empService;

	EmployeeForm empForm = new EmployeeForm();

	public String addCustomer() {
		empService.addCustomer(empForm.getName(), empForm.getDob(), empForm.getGender(), empForm.getIsMarried(),
				empForm.getOccupation(), empForm.getContact().getEmail(), empForm.getContact().getMobile(), empForm
						.getContact().getCity(), empForm.getContact().getPin(), empForm.getContact().getAddress());
		return "success";
	}

	public String manageCustomer() {
		return "success";
	}

	public String changeUserStatus() {
		try {
			empService.changeUserStatus(empForm.getId(), empForm.getStatus(), empForm.getUserType());
			return "success";
		} catch (BankingException e) {
			e.getMessage();
		}
		return "fail";
	}

	public String prePopulateUpdateProfileForm() {
		UserForm userDetails = getUser();
		try {
			Contact contact = empService.getContactDetails(userDetails.getId());
			empForm.setId(contact.getId());
			empForm.getContact().setMobile(contact.getMobile());
			empForm.getContact().setEmail(contact.getEmail());
			return "success";
		} catch (BankingException e) {
			e.getMessage();
		}
		return "fail";
	}

	public String updateProfile() {
		try {
			empService.updateProfile(empForm.getId(), empForm.getContact().getMobile(),
					empForm.getContact().getEmail(), empForm.getQualification(), empForm.getDepartment());
			return "success";
		} catch (BankingException e) {
			e.getMessage();
		}
		return "fail";
	}

	private UserForm getUser() {
		return (UserForm) ServletActionContext.getRequest().getSession().getAttribute("user");
	}

	public EmployeeForm getModel() {
		return empForm;
	}

}
