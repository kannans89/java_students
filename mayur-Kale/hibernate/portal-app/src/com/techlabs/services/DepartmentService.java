package com.techlabs.services;

import java.util.List;

import com.techlabs.dao.DepartmentDao;
import com.techlabs.entity.Department;

public class DepartmentService {
	DepartmentDao deptDao;

	public DepartmentService() {
		// TODO Auto-generated constructor stub
		this.deptDao = new DepartmentDao();
	}

	public boolean addDepartment(Department department) {
		return this.deptDao.addDepartment(department);
	}

	public boolean isDepartmentExists(int deptId) {
		return this.deptDao.isDepartmentExists(deptId);
	}

	public List<Department> getDeptList() {
		return this.deptDao.getDeptList();
	}

	public boolean deleteDepartmentById(int deptId) {
		return deptDao.deleteDepartmentById(deptId);
	}

	public Department getDepartmentById(int deptId) {
		return deptDao.getDepartmentById(deptId);
	}

	public boolean editDepartment(Department editDept) {
		return deptDao.editDepartment(editDept);
	}

}
