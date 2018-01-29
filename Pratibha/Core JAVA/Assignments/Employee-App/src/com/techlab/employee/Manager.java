package com.techlab.employee;

public class Manager extends Employee {
	private double hri = 0.5;
	private double ta = 0.4;

	public Manager(int id, String name, double basicsalary) {
		super(id, name, basicsalary);
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		return (basicSalary + (hri * basicSalary) + (ta * basicSalary));
	}

	
}
