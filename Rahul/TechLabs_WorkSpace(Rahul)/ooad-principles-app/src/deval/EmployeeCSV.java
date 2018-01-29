package deval;

import java.util.StringTokenizer;

public class EmployeeCSV {
	String empno;
	String frstname;
	String designation;
	String emailAddress;
	
	public String getEmpno() {
		return empno;
	}
	public String getFrstname() {
		return frstname;
	}
	public String getDesignation() {
		return designation;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public EmployeeCSV(String info) {
		StringTokenizer token = new StringTokenizer(info, ",");
		if(token.hasMoreElements())
		{
			empno=token.nextToken();
		}
		if(token.hasMoreElements())
		{
			frstname=token.nextToken();
		}
		if(token.hasMoreElements())
		{
			designation=token.nextToken();
		}
		if(token.hasMoreElements())
		{
			emailAddress=token.nextToken();
		}
		
	}

}
