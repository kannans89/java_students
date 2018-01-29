package com.techlabs.customer.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.customer.Customer;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println(factory.getClass());
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		System.out.println(txn.getClass());
		System.out.println(session.getClass());
		Customer cust=new Customer();
		cust.setId(10);
		cust.setName("Pankaj");
		cust.setLocation("K");
		session.save(cust);
		txn.commit();
		session.close();
	}
}
