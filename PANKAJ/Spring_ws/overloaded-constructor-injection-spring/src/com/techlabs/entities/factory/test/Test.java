package com.techlabs.entities.factory.test;

import com.techlabs.entities.Employee;
import com.techlabs.entities.factory.EmployeeFactory;

public class Test {

	public static void main(String[] args) {
		Employee emp=EmployeeFactory.getEmployee("emp3");
		System.out.println(emp);
	}

}
