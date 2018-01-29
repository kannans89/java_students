package com.techlabs.college.person;

import com.techlabs.college.emplyeetype.salary.ISalariedEmploye;

public class Professor extends Person implements ISalariedEmploye{
	
	
	
	public Professor(int id, String address, String dob) {
		super(id, address, dob);
	
	}

	public double getSalary() {
		return salary;
	}
	
	public double calculateSalary()
	{
		
		return salary;
		
	}
	


	
	

}
