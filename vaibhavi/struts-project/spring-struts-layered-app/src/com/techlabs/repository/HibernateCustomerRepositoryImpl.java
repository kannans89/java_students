package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	@Override
	public List<Customer> findAll() {
		System.out.println("in findAll of HibernateCu...");
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Pankaj","Gosavi"));
		customers.add(new Customer("Sachin","Tendulkar"));
		customers.add(new Customer("Rahul","Dravid"));
		return customers;
	}

}
