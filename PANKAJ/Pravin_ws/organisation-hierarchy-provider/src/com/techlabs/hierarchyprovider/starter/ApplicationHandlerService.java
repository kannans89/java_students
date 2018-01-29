package com.techlabs.hierarchyprovider.starter;

import java.util.List;

import com.techlabs.hierarchyprovider.dto.EmployeeDTO;
import com.techlabs.hierarchyprovider.elements.Employee;
import com.techlabs.hierarchyprovider.elements.Organisation;
import com.techlabs.hierarchyprovider.factory.ReadFactory;
import com.techlabs.hierarchyprovider.io.read.InputReader;
import com.techlabs.hierarchyprovider.io.read.ReadingType;
import com.techlabs.hierarchyprovider.io.write.ConsolePrinter;

public class ApplicationHandlerService {
	private Organisation org;
	private InputReader inputReader;
	private ConsolePrinter console;

	public ApplicationHandlerService(ReadingType readFrom) {
		inputReader = ReadFactory.getReader(readFrom);
		console = new ConsolePrinter();
	}

	public void start() {
		List<EmployeeDTO> listOfDTO;
		Employee ceo;

		listOfDTO = inputReader.read();

		org = new Organisation(listOfDTO);
		ceo = org.getCEO();

		console.print(ceo);
	}
}