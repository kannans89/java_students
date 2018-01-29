package com.techlabs.employee;

public class Employee {
	
	private int id;
	private double salary;
	private String name;
	private String designation;
	
	
	public Employee(int id, double salary, String designation) {
		super();
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		System.out.println("Constructor 1 called");
	}
	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
		System.out.println("Constructor 2 called");
	}
	public Employee(int id, double salary, String name, String designation) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		System.out.println("Constructor 3 called");
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}


}
