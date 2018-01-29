package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerRepository custRepository;

	public CustomerServiceImpl() {
		System.out.println("In CustomerService constructor");
	}

	public ICustomerRepository getCustRepository() {
		return custRepository;
	}

	public void setCustRepository(ICustomerRepository custRepository) {
		this.custRepository = custRepository;
	}

	@Override
	public List<Customer> findAll() {
		return custRepository.findAll();
	}

	@Override
	public Customer find(int id) {
		return custRepository.find(id);
	}

	@Override
	public void update(int id, Customer cust) {
		System.out.println("Updating cust details of: " + id);
		custRepository.update(id, cust);
	}

	@Override
	public void delete(int id) {
		System.out.println("deleting: " + id);
		custRepository.delete(id);
	}

	@Override
	public void add(Customer cust) {
		custRepository.add(cust);
	}
}
