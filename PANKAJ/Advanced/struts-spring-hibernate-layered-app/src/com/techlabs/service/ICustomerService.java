package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Customer;


public interface ICustomerService {

	public List<Customer> findAll();
	public Customer find(int id);
	public void update(int id,Customer cust);
	public void delete(int id);
	public void add(Customer cust);
}