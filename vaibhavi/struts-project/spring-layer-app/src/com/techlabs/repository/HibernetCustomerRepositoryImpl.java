package com.techlabs.repository;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.*;

public class HibernetCustomerRepositoryImpl implements ICustomerRepository {
	
	private List<Customer> customers=new ArrayList<Customer>();
	public HibernetCustomerRepositoryImpl()
	{
		customers.add(new Customer("Vaibhavi","gandhi"));
		customers.add(new Customer("Vaib","gai"));
		customers.add(new Customer("abc","xyz"));
		
	}
	
  /* (non-Javadoc)
 * @see com.techlabs.repository.ICustomerRepository#findAll()
 */
@Override
public List<Customer> findAll()
  {
	  return customers;
  }
}
