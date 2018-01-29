package com.techlabs.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {

		ApplicationContext app;
		app=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=app.getBean("employee", Employee.class);
		System.out.println(emp.getDesignation());
	}

}
