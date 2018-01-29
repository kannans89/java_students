package com.techlabs.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Customer;
import com.techlabs.service.ICustomerService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService service = app.getBean("custService",
				ICustomerService.class);
		for (Customer cust : service.findAll()) {
			System.out.println(cust.getFirstName() + " " + cust.getLastName());
		}
	}
}