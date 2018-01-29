package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.model.Customer;
import com.techlabs.repository.HibernateCustomerRepositoryImpl;
import com.techlabs.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository custRepository;

	@Override
	public List<Customer> findAll() {
		System.out.println("In findAll of CustService..");
		return custRepository.findAll();
	}

	public void setCustRepository(HibernateCustomerRepositoryImpl custRepository) {
		this.custRepository = custRepository;
	}

}
