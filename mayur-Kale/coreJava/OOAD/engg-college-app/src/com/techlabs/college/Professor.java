package com.techlabs.college;

import java.util.Calendar;
import java.util.Date;

public class Professor extends Person implements SalariedEmployee {
	private float salary;
	private Date joiningDate;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Professor(int id, String address, Date dob, String name,
			Date joiningDate) {
		super(id, address, dob, name);
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Professor [id= " + this.getId() + " Name= " + this.getName()
				+ " Address= " + this.getAddress() + " Salary= Rs" + salary
				+ ", joiningDate= " + joiningDate + "]";
	}

	@Override
	public void calculateSalay() {
		Calendar calendar = Calendar.getInstance();

		int experience = calendar.get(Calendar.YEAR)
				- this.joiningDate.getYear();
		if (experience >= 1 && experience < 3)
			this.salary = 20000;
		else if (experience >= 3 && experience < 9)
			this.salary = 40000;
		else if (experience >= 9)
			this.salary = 60000;

	}

}
