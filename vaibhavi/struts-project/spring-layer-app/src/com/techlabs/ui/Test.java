package com.techlabs.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService service=context.getBean("customerservice", ICustomerService.class);
		for(Customer x:service.findAll())
		{
			System.out.println(x.getFname());
		}
		
	}

}
