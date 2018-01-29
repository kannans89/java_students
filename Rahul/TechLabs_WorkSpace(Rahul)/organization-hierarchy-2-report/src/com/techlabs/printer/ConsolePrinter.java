package com.techlabs.printer;

import java.util.List;

import com.techlabs.employee.Employee;

public class ConsolePrinter {
	
	public void print(List<Employee> employee){
		for(Employee currentEmployee : employee){
			System.out.println(currentEmployee.getEmployeeName()+" :- ");
			System.out.println(currentEmployee.getReporteeList());
		}
		
	}

}
