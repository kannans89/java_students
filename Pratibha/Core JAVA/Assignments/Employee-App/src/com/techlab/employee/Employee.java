package com.techlab.employee;

public abstract class Employee {
	protected int id;
	protected String name;
	protected double basicSalary;
	public Employee(int id,String name,double basicsalary){
		this.id=id;
		this.name=name;
		this.basicSalary=basicsalary;
	}
	public abstract double calculateNetSalary(double basicSalary);
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getBasicSalary(){
		return basicSalary;
	}
}
