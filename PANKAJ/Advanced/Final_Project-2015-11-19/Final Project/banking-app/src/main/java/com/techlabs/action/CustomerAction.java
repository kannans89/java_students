package com.techlabs.action;

import java.util.Iterator;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.form.AccountForm;
import com.techlabs.action.form.CustomerForm;
import com.techlabs.action.form.PayeeForm;
import com.techlabs.action.form.UserForm;
import com.techlabs.entities.Account;
import com.techlabs.entities.Contact;
import com.techlabs.entities.Payee;
import com.techlabs.exceptions.BankingException;
import com.techlabs.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<CustomerForm> {

	@Autowired
	CustomerService custService;

	CustomerForm custForm = new CustomerForm();
	private static final long serialVersionUID = 1L;

	public String viewHomePage() {
		UserForm userDetails = getUser();
		Iterator<Account> iterator = custService.getAccountsIterator(userDetails.getId());
		fetchAccountsDetails(iterator);
		return "success";
	}

	public String registerPayee() {
		UserForm userDetails = getUser();
		try {
			custService.registerPayee(userDetails.getId(), custForm.getId(), custForm.getPassword());
			return "success";
		} catch (BankingException e) {
			addActionError(e.getMessage());
			return "input";
		}
	}

	public String prePopulateTransferFundsForm() {
		UserForm userDetails = getUser();
		Iterator<Account> accIterator = custService.getAccountsIterator(userDetails.getId());
		Iterator<Payee> payeesIterator = custService.getPayeesIterator(userDetails.getId());
		fetchAccountsDetails(accIterator);
		fetchPayeesDetails(payeesIterator);
		return "success";
	}

	public String transferFunds() {
		try {
			custService.transferFunds(custForm.getFromAccount(), custForm.getToAccount(), custForm.getAmount());
			addActionMessage("Funds transferred succefully");
			return "success";
		} catch (BankingException e) {
			addActionError(e.getMessage());
			return "input";
		}
	}

	public String prePopulateUpdateProfileForm() {
		UserForm userDetails = getUser();
		Contact contact = custService.getContactDetails(userDetails.getId());
		fetchContactDetails(contact);
		return "success";
	}

	public String updateProfile() {
		custService.updateProfile(custForm.getId(), custForm.getContact().getMobile(),
				custForm.getContact().getEmail(), custForm.getOccupation());
		return "success";
	}

	private void fetchContactDetails(Contact contact) {
		custForm.setId(contact.getId());
		custForm.getContact().setMobile(contact.getMobile());
		custForm.getContact().setEmail(contact.getEmail());
	}

	private void fetchAccountsDetails(Iterator<Account> iterator) {
		while (iterator.hasNext()) {
			Account acc = iterator.next();
			AccountForm accForm = new AccountForm();
			accForm.setAccno(acc.getAccno());
			accForm.setBalance(acc.getBalance());
			custForm.getAccounts().add(accForm);
		}
	}

	private void fetchPayeesDetails(Iterator<Payee> iterator) {
		while (iterator.hasNext()) {
			Payee payee = iterator.next();
			PayeeForm payeeForm = new PayeeForm();
			payeeForm.setAccno(payee.getAccno());
			custForm.getPayees().add(payeeForm);
		}
	}

	private UserForm getUser() {
		return (UserForm) ServletActionContext.getRequest().getSession().getAttribute("user");
	}

	public CustomerForm getModel() {
		return custForm;
	}

}
