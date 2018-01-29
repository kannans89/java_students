package com.techlabs.organisation;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.employee.Employee;
import com.techlabs.inputsource.IInputSource;

public class Organisation {
	// Instance vatiables
	private Employee employee;
	private IInputSource inputSource;
	private static Organisation organisation;
	private Map<Integer, String> employeeMap;

	// Constructor
	private Organisation(Employee emp, IInputSource ipsource) {
		employee = emp;
		inputSource = ipsource;
		employeeMap = new HashMap<Integer, String>();
	}

	// Methods
	public static Organisation getOrganisation(Employee emp,
			IInputSource ipsource) {
		if (organisation == null) {
			organisation = new Organisation(emp, ipsource);
		}
		return organisation;
	}
//-----------------------------------------------------------------------------------------------------
	public void setEmployeeMap() {
		employeeMap.put(employee.getemployeeID(), employee.getemployeeName());
	}
//-----------------------------------------------------------------------------------------------------
	public String getEmployeeName(int empID) {
		if (!employeeMap.isEmpty()) {
			if (employeeMap.containsKey(empID)) {
				return employeeMap.get(empID);
			} else {
				System.out.println("Incorrect Employee_ID");
			}
		} else {
			System.out.println("No Elements to Print");
		}
		return null;
	}
//-----------------------------------------------------------------------------------------------------
	public IInputSource getInputSource(){
		return inputSource;
	}
	

}
