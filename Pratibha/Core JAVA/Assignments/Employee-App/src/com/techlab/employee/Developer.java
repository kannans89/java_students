package com.techlab.employee;

public class Developer extends Employee {
	private double perk = 0.2;

	public Developer(int id, String name, double basicsalary) {
		super(id, name, basicsalary);
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		return (basicSalary + (perk * basicSalary));
	}

	}
