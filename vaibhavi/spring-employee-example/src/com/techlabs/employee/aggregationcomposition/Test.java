package com.techlabs.employee.aggregationcomposition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee=context.getBean("InsideSetter", Employee.class);
		System.out.println(employee.getAddress());


	}

}
