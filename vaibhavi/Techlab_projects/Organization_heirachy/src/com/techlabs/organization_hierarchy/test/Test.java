package com.techlabs.organization_hierarchy.test;

import com.techlabs.organization_hierarchy.service.ConsoleWriterService;
import com.techlabs.organization_hierarchy.service.IEmployeeDataService;




public class Test {

	public static void main(String[] args) {

		IEmployeeDataService writer=new ConsoleWriterService();
		writer.provideService();
	}

}
