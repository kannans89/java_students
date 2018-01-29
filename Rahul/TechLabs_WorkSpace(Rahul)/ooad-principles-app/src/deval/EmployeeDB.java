package deval;

public class EmployeeDB implements IEmpInfo{
	int id;
	String name;
	String job;
	String email;
	@Override
	public int getId() {
		return id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getJob() {
		return job;
	}
	@Override
	public String getEmail() {
		return email;
	}
	public EmployeeDB(int id, String name, String job, String email) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.email = email;
	}
	
	
	

}
