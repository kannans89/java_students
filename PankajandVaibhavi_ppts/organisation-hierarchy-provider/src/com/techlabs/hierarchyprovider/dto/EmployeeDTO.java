package com.techlabs.hierarchyprovider.dto;

public class EmployeeDTO {

	private int id;
	private String name;
	private int managerId;

	public EmployeeDTO(int id, String name, int managerId) {
		this.id = id;
		this.name = name;
		this.managerId = managerId;
	}

	public EmployeeDTO(int id, String name) {
		this.id = id;
		this.name = name;
		this.managerId = -1;
	}

	public int getId() {
		return id;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getName() {
		return name;
	}
}
