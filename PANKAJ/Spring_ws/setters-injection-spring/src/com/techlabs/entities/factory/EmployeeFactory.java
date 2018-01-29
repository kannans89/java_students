package com.techlabs.entities.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.entities.Employee;


public class EmployeeFactory {
	
	public static Employee getEmployee(String emp){
		ApplicationContext app=new ClassPathXmlApplicationContext("spring-beans.xml");
		return (Employee) app.getBean(emp);
	}
}