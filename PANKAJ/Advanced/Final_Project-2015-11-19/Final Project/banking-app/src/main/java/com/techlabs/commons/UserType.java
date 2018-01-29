package com.techlabs.commons;

import com.techlabs.entities.Customer;
import com.techlabs.entities.Employee;
import com.techlabs.entities.User;

public enum UserType {
	EMPLOYEE(new Employee()), CUSTOMER(new Customer());

	User user;

	private UserType(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
