package com.techlab.employee;

public class Tester extends Employee {
	private double bonus = 0.1;

	public Tester(int id, String name, double basicsalary) {
		super(id, name, basicsalary);
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		return (basicSalary + (bonus * basicSalary));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
