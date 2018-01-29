package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Pankaj","G"));
		customers.add(new Customer("Sachin","T"));
		customers.add(new Customer("Rahul","D"));
		return customers;
	}

}
