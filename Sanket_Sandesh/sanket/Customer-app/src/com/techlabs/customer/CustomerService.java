package com.techlabs.customer;

import java.util.ArrayList;

public class CustomerService {

	public static ArrayList<Customer> customerList;
	private static CustomerService customerService;

	private CustomerService() {
		customerList = new ArrayList<Customer>();
	}

	public static CustomerService getCustomerService() {
		if (customerService == null)
			customerService = new CustomerService();

		return customerService;
	}

	public void add(Customer customer) {
		customerList.add(customer);
	}

	public ArrayList<Customer> get() {
		return customerList;
	}

	public Customer get(String id) {
		for (Customer customer : customerList) {
			if (customer.id.equals(id))
				return customer;
		}
		return null;
	}

	public void update(Customer customer) {
		for (Customer customer2 : customerList) {
			if (customer.id.equals(customer2.id))
				customer2.name = customer.name;
			customer2.address = customer.address;
		}
	}

	public void deleteCustomer(String id) {
		for (Customer customer : customerList) {
			if (customer.id.equals(id)) {
				customerList.remove(customer);
				break;
			}
		}
	}
}
