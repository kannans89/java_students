package com.techlabs.services;

import java.util.List;

import com.techlabs.dao.EmployeeDao;
import com.techlabs.entity.Employee;

public class EmployeeService {
	EmployeeDao employeeDao;

	public EmployeeService() {
		// TODO Auto-generated constructor stub
		this.employeeDao = new EmployeeDao();
	}

	public boolean addEmployee(Employee employee) {
		return this.employeeDao.addEmployee(employee);
	}

	public boolean isEmployeeExists(int deptId) {
		return this.employeeDao.isEmployeeExists(deptId);
	}

	public List<Employee> getEmpList() {
		return this.employeeDao.getEmpList();
	}

	public boolean deleteEmployeeById(int empId) {
		return this.employeeDao.deleteEmployeeById(empId);
	}

	public Employee getEmployeeById(int empId) {
		return this.employeeDao.getEmployeeById(empId);
	}

	public boolean editEmployee(Employee editEmp) {
		return this.employeeDao.editEmployee(editEmp);
	}

}
