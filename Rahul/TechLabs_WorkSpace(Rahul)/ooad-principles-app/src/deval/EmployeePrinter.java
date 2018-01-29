package deval;

public class EmployeePrinter {
	public void print(IEmpInfo empinfo)
	{
		System.out.println("ID:"+empinfo.getId()+" \n"+
				"Name:"+empinfo.getName()+" \n"+
				"JOB:"+empinfo.getJob()+"\n "+
				"EMail"+empinfo.getEmail());
	}
}
