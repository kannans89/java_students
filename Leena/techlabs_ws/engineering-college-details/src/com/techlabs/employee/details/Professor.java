package com.techlabs.employee.details;

import com.techlabs.employeeSalary.ISalariedEmployee;

public class Professor extends Person implements ISalariedEmployee {
	private String professor_name;
	private double salary;
	public String details;
	
	public Professor(int id,String address,String dob,String name,double salary){
		super(id,address,dob);
		this.professor_name=name;
		this.salary=salary;
		
	}

	public String getName(){
		return professor_name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	@Override
	public double calculateSalary(){
		return salary;
	}
	
	@Override
	public String toString(){
		details="Hey, Hiii.... "+this.getName()+" Your ID is : "+this.getID()+" Address: "+this.getAddress()+" & Dob : "+this.getDOB()+" Salary is :"+this.calculateSalary();
		return details;
	}
	
	}
