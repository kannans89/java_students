package com.techlabs.organisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.employeedetails.Employee;
import com.techlabs.input.EmployeeDTO;

public class Organisation {
	private Map<String, Employee> employeeMap = new HashMap<String, Employee>();
	private List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();

	public Organisation(List<EmployeeDTO> inputList) {
		this.empList = inputList;
	}

	public List<Employee> createHeirarchy() {
		List<Employee> reporteeList = new ArrayList<Employee>();
		List<Employee> dummyList = new ArrayList<Employee>();
		Employee dummyEmployee = new Employee("", "", dummyList);

		for (EmployeeDTO currentEmployee : empList) {

			Employee employee = new Employee(currentEmployee.getEmpID(),
					currentEmployee.getEmpName(), reporteeList);
			employee.setEmployeeManagerID(currentEmployee.getEmpManagerID());

			if (!employeeMap.containsKey(employee.getID())) {
				employeeMap.put(employee.getID(), employee);
			} else if (employeeMap.containsKey(employee.getID())) {

				List<Employee> reporteeList1 = (employeeMap.get(employee
						.getmanagerID())).getReporteeList();
				for (Employee reportee : reporteeList1) {
					employee.addReportee(reportee);
				}

			}
			
			(employeeMap.get(employee.getID()))
			.setEmployeeManagerID(employee.getmanagerID());
	(employeeMap.get(employee.getID()))
			.setEmployeeName(employee.getName());
		}
		
		return reporteeList;
	}

}
