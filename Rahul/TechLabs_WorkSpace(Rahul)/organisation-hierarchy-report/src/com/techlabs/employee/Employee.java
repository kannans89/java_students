package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	// Instance Variables
	private int employeeID;
	private String employeeName;
	private int managerID;
	List<Employee> reporteeList;

	// Constructor
	public Employee(int id, String name, int mgrID) {
		employeeID = id;
		employeeName = name;
		managerID = mgrID;
		reporteeList = new ArrayList<Employee>();
	}

	// Methods
	public int getemployeeID() {
		return employeeID;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public int getmanagerID() {
		return managerID;
	}

	public void addReportee(Employee employeeToAdd) {
		reporteeList.add(employeeToAdd);
	}

	public void removeRepotee(Employee employeeToRemove) {
		if (!reporteeList.isEmpty()) {
			boolean removeStatus = reporteeList.remove(employeeToRemove);
			if (removeStatus) {
				System.out.println(employeeToRemove + " removed");
			} else {
				System.out.println(employeeToRemove
						+ " not present in the List");
			}
		} else {
			System.out.println("No Elements to remove");
		}

	}

	public void printReportees() {
		
		System.out.println("Name : " + getemployeeName()+"("+getemployeeID()+")\t -- > ManagerID : "+getmanagerID());
		System.out.println("\t |");
		System.out.println("\t |");
		System.out.print("\t  -->");
		for (Employee currentEmployee : reporteeList) {
			
			currentEmployee.printReportees();
		}

	}

}
