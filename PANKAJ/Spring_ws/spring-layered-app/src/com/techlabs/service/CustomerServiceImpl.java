package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements ICustomerService {
	HibernateCustomerRepositoryImpl custRepository;

	@Override
	public List<Customer> findAll() {
		return custRepository.findAll();
	}

	public void setCustRepository(HibernateCustomerRepositoryImpl custRepository) {
		this.custRepository = custRepository;
	}

}
