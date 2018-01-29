package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerRepository customerRepository;

	public ICustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.techlabs.service.ICustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		 return customerRepository.findAll();
	}

}
