package com.techlabs.repository;

import java.util.List;

import com.techlabs.model.Customer;

public interface ICustomerRepository {

	public List<Customer> findAll();

	public Customer find(int id);

	public void update(int id, Customer cust);

	public void add(Customer cust);

	public void delete(int id);
}