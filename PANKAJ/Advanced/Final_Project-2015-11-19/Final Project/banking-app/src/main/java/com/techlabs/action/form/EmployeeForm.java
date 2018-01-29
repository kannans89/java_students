package com.techlabs.action.form;

import com.techlabs.commons.UserType;
import com.techlabs.entities.Employee;

public class EmployeeForm extends UserForm {

	private String qualification;
	private String department;
	private String occupation;
	private double balance;

	public EmployeeForm() {
		super();
	}

	public EmployeeForm(int id, String name, String password, String newPassword, UserType userType,
			String qualification, String department) {
		super(id, name, password, newPassword, userType);
		this.qualification = qualification;
		this.department = department;
	}

	public void fetchPersonalDetails(Employee emp) {
		super.fetchContactDetails(emp);
		this.department = emp.getDepartment();
		this.qualification = emp.getQualification();
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}

}
