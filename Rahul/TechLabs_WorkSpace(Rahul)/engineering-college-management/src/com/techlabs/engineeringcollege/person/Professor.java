package com.techlabs.engineeringcollege.person;

import java.util.Arrays;

import com.techlabs.engineeringcollege.Subjects;
import com.techlabs.engineeringcollege.Expenditure.ISalariedEmployee;
import com.techlabs.engineeringcollege.Expenditure.ISalaryCaculable;

public class Professor extends Person implements ISalariedEmployee,
		ISalaryCaculable {
	public Professor(int id, String name, String address, String dateOfBirth,
			Subjects[] subject, ISalaryCaculable salGrade) {
		super(id, name, address, dateOfBirth);
		for (int i = 0; i < subject.length; i++) {
			subjectOfExperties[i] = subject[i];
			salaryGrade = salGrade;

		}
	}

	public Subjects[] getToughtSubjects() {
		return subjectOfExperties;

	}

	@Override
	public double perDaySalary() {
		return salaryGrade.perDaySalary();
	}

	@Override
	public double calculateSalary() {
		double Salary = salaryGrade.perDaySalary() * 30;
		return Salary;
	}

	@Override
	public String toString() {
		return " Tought Subjects:-" + Arrays.toString(getToughtSubjects())
				+ "\n Per Day Salary:- " + perDaySalary()
				+ "\nMonthly Salary():-" + calculateSalary()
				+"\nAddress :-"+ getAddress()
				+ "\n=====================================";
	}

	// instance Variable
	private Subjects[] subjectOfExperties = new Subjects[3];
	private ISalaryCaculable salaryGrade;
}
