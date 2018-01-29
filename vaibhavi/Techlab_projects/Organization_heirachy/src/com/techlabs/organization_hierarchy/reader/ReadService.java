package com.techlabs.organization_hierarchy.reader;

import java.util.List;

import com.techlabs.organization_hierarchy.elements.EmployeeDTO;
import com.techlabs.organization_hierarchy.elements.Employees;

public class ReadService {
	
	public List<Employees> read(ReadType type)
	{
		IReader reader=null;
		if(type==ReadType.FILEREAD)
		{
			reader=new File_Reader();
			
		}
		if(type==ReadType.DATABASEREAD)
		{
			reader=new DataBaseReader();
		}
		
		return (reader.read());
		
	}
	

}
