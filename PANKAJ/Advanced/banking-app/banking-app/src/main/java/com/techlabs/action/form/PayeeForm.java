package com.techlabs.action.form;

public class PayeeForm {
	private int accno;

	private CustomerForm customer;

	public PayeeForm() {

	}

	public PayeeForm(int accno) {
		this.accno = accno;
	}

	public CustomerForm getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerForm customer) {
		this.customer = customer;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	@Override
	public String toString() {
		return accno + "";
	}

}
