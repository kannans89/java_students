package com.techlabs.hierarchyprovider.io.write;

import com.techlabs.hierarchyprovider.elements.Employee;

public class ConsolePrinter {

	public void print(Employee ceo) {
		print(ceo, 0);
	}

	void print(Employee thisEmployee, int level) {

		String whiteSpaces = "";
		for (int levelCount = level; levelCount > 0; levelCount--) {
			whiteSpaces += "\t";
		}
		System.out.println(whiteSpaces + thisEmployee.toString());

		int noOfReportee = thisEmployee.getReportees().size();
		while (noOfReportee > 0) {
			level++;
			for (Employee emp : thisEmployee.getReportees()) {
				print(emp, level);
				noOfReportee--;
			}
		}
	}
}