package com.techlabs.entity;

public class Employee {
	private int empId;
	private String empName;
	private int deptNo;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int deptNo) {
		this.empId = empId;
		this.empName = empName;
		this.deptNo = deptNo;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

}
