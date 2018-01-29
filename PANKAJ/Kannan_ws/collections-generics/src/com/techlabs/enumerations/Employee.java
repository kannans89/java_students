package com.techlabs.enumerations;

public class Employee {
	String name;
	int id;
	double salary;
	BandType type;
	static int count;
	
	static{
		count=100;
	}

	public Employee(int id, String name, double salary, BandType type) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.type = type;
		count++;
	}

	public int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public BandType getType() {
		return type;
	}

}
