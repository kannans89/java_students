package com.techlabs.organization_hierarchy.printer;

import java.util.List;

import com.techlabs.organization_hierarchy.elements.Employees;

public class PrintHierarchy  {
	
	
	  public void print(Employees emp,int depth) {
			List<Employees> reportees = emp.getEmployees();

			if (depth == 0) {
				System.out.println(emp.getName() + "........"
						+ emp.getDesignation());
			} else {
				String tabs = String.format("%0" + depth + "d", 0).replace("0",
						"    "); // 4 spaces
				System.out.println(tabs + emp.getName()
						+ "........" + emp.getDesignation());
			}
			depth++;
			for (Employees empl : reportees) {

				// Recursive call
				this.print(empl,depth);
			}
		}


	
	

}
