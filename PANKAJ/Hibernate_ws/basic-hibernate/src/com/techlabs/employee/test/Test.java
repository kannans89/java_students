package com.techlabs.employee.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.employee.Employee;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println(factory.getClass());
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		System.out.println(txn.getClass());
		System.out.println(session.getClass());
		Employee emp=new Employee();
		emp.setId(10);
		emp.setName("Pankaj");
		emp.setSalary(25000);;
		session.save(emp);
		txn.commit();
		session.close();
	}
}
