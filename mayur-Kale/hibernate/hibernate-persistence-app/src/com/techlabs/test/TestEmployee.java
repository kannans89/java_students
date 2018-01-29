package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(2, "Mayur", "Panvel", 50000);
		Employee emp2 = new Employee(4, "Vikram", "Ambernath", 40000);
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		Configuration config = new Configuration();
		System.out.println(config.getClass());
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.1();

		System.out.println(factory.getClass());
		System.out.println(session.getClass());
		System.out.println("Session opened");

		Transaction transaction = session.beginTransaction();

		System.out.println(transaction.getClass());

//		session.save(emp1);
//		session.save(emp2);
		for (Employee employee : emplist) {
			session.save(employee);	
		}
		
		Employee employee = (Employee) session.get(Employee.class, 1);
		System.out.println(employee);
		employee.setName("XYZ");

		session.save(employee);

//		session.delete(session.get(Employee.class, 2));

		transaction.commit();
		session.close();

		System.out.println("End of main");
	}

}
