package com.techlabs.organization_hierarchy.elements;

import java.util.ArrayList;
import java.util.List;

public class Employees {

	private String name;
	private String designation;
	private String manager;
	List<Employees> Listemployees=new ArrayList<Employees>();
	
	public Employees(String name,String designation,String manager)
	{
		this.designation=designation;
		this.name=name;
		this.manager=manager;
	}
	
	public Employees(String name,String designation)
	{
		this.designation=designation;
		this.name=name;
		
	}
	
	
	public void addEmployee(Employees employee)
	{
		Listemployees.add(employee);
		
	}
	
	

	@Override
	public String toString() {
		return "Employees [name=" + name + ", designation=" + designation
				+ ", manager=" + manager + "]";
	}

	public List<Employees> getEmployees() {
		return Listemployees;
	}
	
	public String getManager() {
		return manager;
	}


	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}
	
	

}
