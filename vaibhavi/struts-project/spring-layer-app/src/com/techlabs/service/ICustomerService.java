package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Customer;

public interface ICustomerService {

	public abstract List<Customer> findAll();

}