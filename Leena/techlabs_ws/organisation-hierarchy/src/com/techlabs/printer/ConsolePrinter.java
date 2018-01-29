package com.techlabs.printer;

import java.util.List;

import com.techlabs.employeedetails.Employee;
	public class ConsolePrinter {
		
		public void print(List<Employee> employee){
			for(Employee currentEmployee : employee){
				System.out.println(currentEmployee.getName());
				System.out.println(currentEmployee.getReporteeList());
			}
			
		}
}
