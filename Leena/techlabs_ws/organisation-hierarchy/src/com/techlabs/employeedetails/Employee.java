package com.techlabs.employeedetails;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String id;
	private String name;
	private String managerID;
	private List<Employee> reporteeList = new ArrayList<Employee>();

	public Employee(String id, String name, List<Employee> reporteeList) {
		this.id = id;
		this.name = name;
		this.reporteeList=reporteeList;
	}

	public String getID() {
		return this.id;
	}
	
	public void setEmployeeName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmployeeManagerID(String empManagerID) {
		this.managerID = empManagerID;
	}

	public String getmanagerID() {
		return this.managerID;
	}

	
	public void addReportee(Employee employeeToAdd) {
		reporteeList.add(employeeToAdd);
	}

	public void removeReportee(Employee employeeToRemove) {
		if (!reporteeList.isEmpty()) {
			if (reporteeList.contains(employeeToRemove)) {
				reporteeList.remove(employeeToRemove);
				System.out.println(employeeToRemove + " is Removed successfully.");
			}
		}
	}
	
	public List<Employee> getReporteeList() {
		return reporteeList;
	}
	
	
	@Override
	public String toString() {
		return "ID=" + this.id + ", Name=" + this.name;
	}

	
	

}
