package com.techlabs.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.action.form.UserType;
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
		if (user != null)
			user.changeStatusTo(newStatus);
		else
			throw new BankingException("Invalid User");
	}

	@Transactional
	public Contact getContactDetails(int id) {
		Employee emp = getEmployee(id);
		if (emp != null)
			return emp.getContact();
		else
			throw new BankingException("Invalid User");
	}

	@Transactional
	public void updateProfile(int id, String mobile, String email, String qualification, String department) {
		Employee emp = getEmployee(id);
		if (emp != null)
			emp.update(mobile, email, qualification, department);
		else
			throw new BankingException("Invalid User");
	}

	private Employee getEmployee(int id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	private User getUser(UserType userType, int id) {
		return (User) sessionFactory.getCurrentSession().get(userType.getUser().getClass(), id);
	}

}
