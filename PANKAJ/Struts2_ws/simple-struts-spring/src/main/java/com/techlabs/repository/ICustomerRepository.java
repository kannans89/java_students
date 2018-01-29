package com.techlabs.repository;

import java.util.List;

import com.techlabs.model.Customer;

public interface ICustomerRepository {

	List<Customer> findAll();

}