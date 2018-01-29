package com.techlabs.action.form;

public class AccountForm {
	private int accno;
	private double balance;

	//private CustomerForm customer;

	public AccountForm() {
	}

	public AccountForm(int accid, double balance) {
		super();
		this.accno = accid;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accid) {
		this.accno = accid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*public CustomerForm getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerForm customer) {
		this.customer = customer;
	}*/

	@Override
	public String toString() {
		return accno + "";
	}

}
