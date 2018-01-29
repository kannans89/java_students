package com.techlabs.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techlabs.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {
	Session session;

	public HibernateCustomerRepositoryImpl() {
		System.out.println("In HibernateRepository Contructor");
	}
	
	@Override
	public List<Customer> findAll() {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Customer> customers = session.createCriteria(Customer.class)
				.list();
		return customers;

	}

	@Override
	public Customer find(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		Customer cust = (Customer) session.get(Customer.class, new Integer(id));
		return cust;
	}

	@Override
	public void update(int id, Customer newCust) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();
		Customer cust = (Customer) session.get(Customer.class, new Integer(id));
		session.delete(cust);
		session.save(newCust);
		txn.commit();
	}

	@Override
	public void add(Customer cust) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();
		session.save(cust);
		txn.commit();
	}

	@Override
	public void delete(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();
		Customer cust = (Customer) session.get(Customer.class, new Integer(id));
		session.delete(cust);
		txn.commit();
	}
}
