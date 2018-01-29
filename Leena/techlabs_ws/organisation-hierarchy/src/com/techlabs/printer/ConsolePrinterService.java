package com.techlabs.printer;
import java.util.List;
import com.techlabs.employeedetails.Employee;
import com.techlabs.input.DBReader;
import com.techlabs.input.DataFromFile;
import com.techlabs.input.EmployeeDTO;
import com.techlabs.input.IInputSource;
import com.techlabs.input.InputSourceFactory;
import com.techlabs.input.SourceType;
import com.techlabs.organisation.Organisation;

public class ConsolePrinterService implements IConsolePrinter{

	public void printToConsole(SourceType sourceType){
		IInputSource reader = InputSourceFactory.createSource(sourceType);
		List<EmployeeDTO> inputList = reader.read();
		Organisation organisationObject = new Organisation(inputList);
		List<Employee> empList = organisationObject.createHeirarchy();
		ConsolePrinter printer = new ConsolePrinter();
		printer.print(empList);
	}

}
