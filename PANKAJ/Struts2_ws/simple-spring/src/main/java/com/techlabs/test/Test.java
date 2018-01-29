package com.techlabs.test;

import com.techlabs.service.ICustomerService;
import com.techlabs.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		System.out.println("hello World ");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerService service = appContext.getBean("customerService", ICustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
