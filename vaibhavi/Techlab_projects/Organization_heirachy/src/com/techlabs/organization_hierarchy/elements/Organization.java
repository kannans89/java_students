package com.techlabs.organization_hierarchy.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Organization {

	private Employees CEO;
	private HashMap<String, Employees> employees;

	public Organization() {
		employees = new HashMap<String, Employees>();
	}

	public Employees getCEO() {
		return CEO;
	}

	public void setCEO(Employees CEO) {
		this.CEO = CEO;
	}

	public HashMap<String, Employees> getEmployees() {
		return employees;
	}

	public void MakeHierarchy(List<Employees> employeeList) {
		
		for (Employees emp : employeeList) {
            
			employees.put(emp.getName(), emp);

		}
		for (Employees emp : employeeList) {
			if (emp.getManager() != null) {
				employees.get(emp.getManager()).addEmployee(emp);
			}
			if (emp.getDesignation().equals("CEO")) {
				setCEO(emp);
			}
		}
		for (Employees emp : employeeList) {
			if (!(emp.getDesignation().equals("CEO")))
			{
				if (emp.getDesignation().equals("manager")) {
					employees.get(getCEO().getName()).addEmployee(emp);
				}
			}
		}
	}

}
