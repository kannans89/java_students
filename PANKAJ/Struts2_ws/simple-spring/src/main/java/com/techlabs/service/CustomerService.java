package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techlabs.model.Customer;
import com.techlabs.repository.ICustomerRepository;



@Service("customerService")
public class CustomerService implements ICustomerService {

	@Autowired
	//@Qualifier("customerRepository123")
	private ICustomerRepository customerRepository;
	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
