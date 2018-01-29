package deval;

public class TestAdapter {

	 public static void main(String[] args) {
		 
		 EmployeeCSV csvEmp = new EmployeeCSV("101,kannan,developer,abc@abc.com");
		 
		 EmployeePrinter empPrinter = new EmployeePrinter();
		 empPrinter.print(new EmployeeCSVAdapter(csvEmp));
		
	}
	 

}
