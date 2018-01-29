package com.techlab.objectCreationWays;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		}
		return obj;
	}

	public void setName(String name) {
		this.name=name;
	}
}
