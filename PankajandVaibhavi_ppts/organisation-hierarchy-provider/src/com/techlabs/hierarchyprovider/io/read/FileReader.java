package com.techlabs.hierarchyprovider.io.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.hierarchyprovider.dto.EmployeeDTO;
import com.techlabs.hierarchyprovider.exceptions.InvalidInputException;

public class FileReader implements InputReader {

	private String fileLocation;

	public FileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public List<EmployeeDTO> read() {
		String currentLine, lineInfo[];
		EmployeeDTO empDTO;
		List<EmployeeDTO> listOfDTO = new ArrayList<EmployeeDTO>();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new java.io.FileReader(fileLocation));

			while ((currentLine = reader.readLine()) != null) {
				lineInfo = currentLine.split(" ");
				if (lineInfo.length == 2)
					empDTO = new EmployeeDTO(Integer.parseInt(lineInfo[0]),
							lineInfo[1], -1);
				else if (lineInfo.length == 3)
					empDTO = new EmployeeDTO(Integer.parseInt(lineInfo[0]),
							lineInfo[1], Integer.parseInt(lineInfo[2]));
				else
					throw new InvalidInputException("Error.. Invalid Input");
				listOfDTO.add(empDTO);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}
		return listOfDTO;
	}

}
