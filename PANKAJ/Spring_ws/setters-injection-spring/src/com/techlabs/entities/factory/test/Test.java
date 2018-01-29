package com.techlabs.entities.factory.test;

import com.techlabs.entities.Employee;
import com.techlabs.entities.factory.EmployeeFactory;

public class Test {

	public static void main(String args[]) {
		Employee emp = EmployeeFactory.getEmployee("employee");
		System.out.println(emp);
	}

}
