package com.techlabs.college.persons;

import com.techlabs.college.employee.types.SalariedEmployee;

public class Professor extends Person implements SalariedEmployee {

	public Professor(int id, String name, String address, String dob, int salary) {
		super(id, name, address, dob);
	}

	public double calcSalary() {
		return salary + salary * 0.1;
	}

}
