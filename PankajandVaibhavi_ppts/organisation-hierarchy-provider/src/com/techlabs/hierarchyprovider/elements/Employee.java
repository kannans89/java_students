package com.techlabs.hierarchyprovider.elements;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<Employee> reportees;
	private int managerId;

	Employee(int id){
		this.id=id;
		reportees=new ArrayList<Employee>();
	}
	
	Employee(int id, String name, int managerId) {
		this(id);
		this.name = name;
		this.managerId = managerId;
	}

	Employee(int id, String name, List<Employee> reportees, int managerId) {
		this(id,name,managerId);
		this.reportees = reportees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getManagerId() {
		return managerId;
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public void addReportee(Employee emp){
		reportees.add(emp);
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setManagerId(int managerId){
		this.managerId=managerId;
	}
	
	@Override
	public String toString() {
		String reportsTo = "";
		if (managerId != -1)
			reportsTo = " ReportsTo:" + managerId;
		return "ID:" + id + " Name:" + name + reportsTo;
	}

}
