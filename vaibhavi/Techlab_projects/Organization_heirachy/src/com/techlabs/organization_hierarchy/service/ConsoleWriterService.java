package com.techlabs.organization_hierarchy.service;

import java.util.List;

import com.techlabs.organization_hierarchy.elements.EmployeeDTO;
import com.techlabs.organization_hierarchy.elements.Employees;
import com.techlabs.organization_hierarchy.elements.Organization;
import com.techlabs.organization_hierarchy.printer.PrintHierarchy;
import com.techlabs.organization_hierarchy.reader.ReadService;
import com.techlabs.organization_hierarchy.reader.ReadType;

public class ConsoleWriterService implements IEmployeeDataService {

	Organization organization;
	PrintHierarchy printer;
	ReadService reader;
	
	public ConsoleWriterService()
	{
		organization=new Organization();
		printer=new PrintHierarchy();
		reader=new ReadService();
	}


	public void provideService() {
		List<Employees> EmployeeList=reader.read(ReadType.FILEREAD);
		organization.MakeHierarchy(EmployeeList);
		printer.print(organization.getCEO(),0);

	}

}
