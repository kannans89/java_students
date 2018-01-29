package com.techlabs.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.commons.UserType;
import com.techlabs.entities.Contact;
import com.techlabs.entities.Customer;
import com.techlabs.entities.Employee;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;

@Service
public class EmployeeService {
	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AccountService accountService;

	@Transactional
	public void addCustomer(String name, Date dob, char gender, char isMarried, String occupation, String email,
			String mobile, String city, int pin, String address) {
		Customer customer = new Customer(name, dob, gender, isMarried, occupation, email, mobile, city, pin, address);
		sessionFactory.getCurrentSession().save(customer);
	}

	@Transactional
	public void changeUserStatus(int id, char newStatus, UserType userType) {
		User user = getUser(userType, id);
		user.changeStatusTo(newStatus);
	}

	@Transactional
	public Contact getContactDetails(int id) {
		Employee emp = (Employee) getUser(UserType.EMPLOYEE, id);
		return emp.getContact();
	}

	@Transactional
	public int getBalance(int accno) {
		return accountService.getBalance(accno);
	}

	@Transactional
	public void updateAccount(int id, double amount) {
		accountService.updateAccount(id, amount);
	}

	@Transactional
	public void updateProfile(int id, String mobile, String email, String qualification, String department) {
		Employee emp = (Employee) getUser(UserType.EMPLOYEE, id);
		emp.update(mobile, email, qualification, department);
	}

	private User getUser(UserType userType, int id) {
		User user = (User) sessionFactory.getCurrentSession().get(userType.getUser().getClass(), id);
		if (user != null)
			return user;
		else
			throw new BankingException("Invalid User");
	}

}
