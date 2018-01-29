package deval;

public class EmployeeCSVAdapter implements IEmpInfo{
	
	EmployeeCSV empcsv;
	
	public EmployeeCSVAdapter(EmployeeCSV empcsv) {
		this.empcsv=empcsv;
	}

	@Override
	public int getId() {
		return Integer.parseInt(empcsv.getEmpno());
	}

	@Override
	public String getName() {
		return empcsv.getFrstname();
	}

	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return empcsv.getDesignation();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return empcsv.getEmailAddress();
	}
	
	

}
