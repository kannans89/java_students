package com.techlabs.organization_hierarchy.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.organization_hierarchy.elements.EmployeeDTO;
import com.techlabs.organization_hierarchy.elements.Employees;

public class File_Reader implements IReader {

	private BufferedReader bufferedReader;
	private List<Employees> employeeDetail;
	
	public File_Reader()
	{
		employeeDetail = new ArrayList<Employees>();
	}

	@Override
	public List<Employees> read() {

		try {
			File file = new File("employees.txt");
			FileReader reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			String strLine = "";
			String tokens[];
			while ((strLine = bufferedReader.readLine()) != null) {
				tokens = strLine.split("/");
				if (tokens.length == 3) {
					employeeDetail.add(new Employees(tokens[0], tokens[1],
							tokens[2]));
				}
				if (tokens.length == 2) {
					employeeDetail.add(new Employees(tokens[0], tokens[1]));
				}

			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return employeeDetail;

	}

}
