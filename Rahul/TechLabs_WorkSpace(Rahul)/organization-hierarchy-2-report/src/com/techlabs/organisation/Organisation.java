package com.techlabs.organisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.employee.Employee;
import com.techlabs.input.EmployeeDTO;

public class Organisation {

	// Ivars
	private Map<String, Employee> employeeMap = new HashMap<String, Employee>();
	private List<EmployeeDTO> inputList = new ArrayList<EmployeeDTO>();

	// Constructor
	public Organisation(List<EmployeeDTO> inputList) {
		this.inputList = inputList;

	}

	// Methods
	public List<Employee> createHeirarchy() {
		List<Employee> reporteeList = new ArrayList<Employee>();
		//Employee employee = new Employee("", "", reporteeList);
		List<Employee> dummyList = new ArrayList<Employee>();
		Employee dummyEmployee = new Employee(" ", " ", dummyList);

		for (EmployeeDTO currentEmp : inputList) {
			// System.out.println("id :"+currentEmp.getEmpID()+" name :"+currentEmp.getEmpName()+" ReporteeList :"+reporteeList);

			Employee employee = new Employee(currentEmp.getEmpID(),
					currentEmp.getEmpName(), reporteeList);
			employee.setEmployeeManagerID(currentEmp.getEmpManagerID());
			//System.out.println(employee);

			if (!employeeMap.containsKey(employee.getEmployeeID())) {
				employeeMap.put(employee.getEmployeeID(), employee);
			} else if (employeeMap.containsKey(employee.getEmployeeID())) {

				List<Employee> reporteeList1 = (employeeMap.get(employee
						.getEmployeeID())).getReporteeList();
				for (Employee reportee : reporteeList1) {
					employee.addReportee(reportee);
				}

				/*
				 * if (employee.getEmployeeID().equals(
				 * dummyEmployee.getEmployeeID())) { for (Employee reportee :
				 * dummyEmployee.getReporteeList()) {
				 * employee.addReportee(reportee); }
				 */
				(employeeMap.get(employee.getEmployeeID()))
						.setEmployeeManagerID(employee.getEmployeeManagerID());
				(employeeMap.get(employee.getEmployeeID()))
						.setEmployeeName(employee.getEmployeeName());
			}

			// checking if Manager is present :
			// if present employee will be aaded to manager's reportee List.

			if (employeeMap.containsKey(employee.getEmployeeManagerID())) {
				Employee manager = employeeMap.get(employee.getEmployeeManagerID());
				manager.addReportee(employee);
				reporteeList = manager.getReporteeList();
			}
			// if Manager Not present the create dummy employee whoz EmpID is
			// same as Employee's Manager ID.

			else /* (!employeeMap.containsKey(employee.getEmployeeManagerID())) */{
				dummyEmployee = new Employee(employee.getEmployeeManagerID(),
						" ", dummyList);
				dummyEmployee.addReportee(employee);
				employeeMap.put(dummyEmployee.getEmployeeID(), dummyEmployee);

			}
			
		}
		
		System.out.println(employeeMap);
		return reporteeList;

	}

}
