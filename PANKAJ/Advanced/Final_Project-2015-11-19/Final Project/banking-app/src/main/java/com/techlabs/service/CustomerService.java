package com.techlabs.service;

import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.entities.Account;
import com.techlabs.entities.Contact;
import com.techlabs.entities.Customer;
import com.techlabs.entities.Payee;
import com.techlabs.exceptions.BankingException;

@Service
public class CustomerService {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AccountService accountService;

	@Transactional
	public void registerPayee(int id, int payeeId, String password) {
		Customer customer = getCustomer(id);
		boolean validCustomer = customer.validate(password);
		boolean payeeExists = accountService.accountExists(payeeId);
		if (validCustomer && payeeExists) {
			Payee payee = new Payee(payeeId, customer);
			customer.addPayee(payee);
		} else
			throw new BankingException("Incorrect Details");
	}

	@Transactional
	public void transferFunds(int from, int to, double amount) {
		accountService.transferFunds(from, to, amount);
	}

	@Transactional
	public void updateProfile(int id, String mobile, String email, String occupation) {
		Customer customer = getCustomer(id);
		customer.update(mobile, email, occupation);
	}

	@Transactional
	public Iterator<Account> getAccountsIterator(int id) {
		Customer customer = getCustomer(id);
		return customer.getAccounts().iterator();
	}

	@Transactional
	public Iterator<Payee> getPayeesIterator(int id) {
		Customer customer = getCustomer(id);
		return customer.getPayees().iterator();
	}

	@Transactional
	public Contact getContactDetails(int id) {
		Customer customer = getCustomer(id);
		return customer.getContact();
	}

	private Customer getCustomer(int id) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
		if (customer != null)
			return customer;
		else
			throw new BankingException("Invalid Customer");
	}

}
