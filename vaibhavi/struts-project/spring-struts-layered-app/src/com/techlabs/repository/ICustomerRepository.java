package com.techlabs.repository;

import java.util.List;

import com.techlabs.model.Customer;

public interface ICustomerRepository {

	public abstract List<Customer> findAll();

}