package com.techlabs.engineeringcollege.person;

import com.techlabs.engineeringcollege.Expenditure.ISalariedEmployee;
import com.techlabs.engineeringcollege.Expenditure.ISalaryCaculable;

public class Principle extends Person implements ISalariedEmployee,
		ISalaryCaculable {
	public Principle(int id, String name, String address, String dateOfBirth,
			ISalaryCaculable salGrade) {
		super(id, name, address, dateOfBirth);
		salaryGrade = salGrade;
	}

	public double perDaySalary() {
		return salaryGrade.perDaySalary();
	}

	public double calculateSalary() {
		double Salary = salaryGrade.perDaySalary() * 30;
		return Salary;
	}

	// Instance Variable
	private ISalaryCaculable salaryGrade;

	@Override
	public String toString() {
		return "Per Day Salary() :- " + perDaySalary()
				+ "\ncalculateSalary :- " + calculateSalary() + "\nId() :-"
				+ getId() + "\nName :-" + getName() + "\nAddress :-"
				+ getAddress() + "\nDOB :-" + getDOB()
				+ "\n=======================================================";
	}
}
