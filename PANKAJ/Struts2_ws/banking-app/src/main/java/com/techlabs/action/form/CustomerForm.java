package com.techlabs.action.form;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.techlabs.entities.Account;
import com.techlabs.entities.Customer;
import com.techlabs.entities.Payee;

public class CustomerForm extends UserForm {
	private String occupation;
	private int fromAccount;
	private int toAccount;
	private double amount;

	private Set<AccountForm> accounts;

	private Set<PayeeForm> payees;

	public CustomerForm() {
		super();
		accounts = new HashSet<AccountForm>();
		payees = new HashSet<PayeeForm>();
	}

	public CustomerForm(int id, String name, String password, String newPassword, UserType userType,
			String occupation, int fromAccount, int toAccount, double amount) {
		super(id, name, password, newPassword, userType);
		this.occupation = occupation;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}


	public void fetchAccountsDetails(Customer customer) {
		Iterator<Account> iterator;
		iterator = customer.getAccounts().iterator();
		while (iterator.hasNext()) {
			Account acc = iterator.next();
			AccountForm accForm = new AccountForm();
			accForm.setAccno(acc.getAccno());
			accForm.setBalance(acc.getBalance());
			//accForm.setCustomer(this);
			this.accounts.add(accForm);
		}
	}

	public void fetchPayeesDetails(Customer customer) {
		Iterator<Payee> iterator;
		iterator = customer.getPayees().iterator();
		while (iterator.hasNext()) {
			Payee payee = iterator.next();
			PayeeForm payeeForm = new PayeeForm();
			payeeForm.setAccno(payee.getAccno());
			payeeForm.setCustomer(this);
			this.payees.add(payeeForm);
		}
	}

	public void fetchPersonalDetails(Customer customer) {
		super.fetchContactDetails(customer);
		this.setOccupation(customer.getOccupation());
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setAccounts(Set<AccountForm> accounts) {
		this.accounts = accounts;
	}

	public Set<AccountForm> getAccounts() {
		return accounts;
	}

	public Set<PayeeForm> getPayees() {
		return payees;
	}

	public void setPayees(Set<PayeeForm> payees) {
		this.payees = payees;
	}

	public int getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}

	public int getToAccount() {
		return toAccount;
	}

	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double balance) {
		this.amount = balance;
	}

}
