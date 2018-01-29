package com.techlabs.input;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.employeedetails.Employee;

public class DBReader extends IInputSource{
	 
	@Override
	public List<EmployeeDTO> read(){
		List<EmployeeDTO> DTOlist = new ArrayList<EmployeeDTO>();

		FileReader file = null;
		try {
			file = new FileReader("EmployeeDataFile");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		BufferedReader buffer = new BufferedReader(file);
		String line;
		try {
			while ((line = buffer.readLine()) != null) {

				String[] tokens = line.split("/");
				
				System.out.print(tokens[0]);
				System.out.print(tokens[1]);
				System.out.print(tokens[2]);
				System.out.println();
				EmployeeDTO DTOobject = new EmployeeDTO(tokens[0], tokens[1],
						tokens[2]);
				DTOlist.add(DTOobject);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			buffer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return DTOlist;
	}



}
