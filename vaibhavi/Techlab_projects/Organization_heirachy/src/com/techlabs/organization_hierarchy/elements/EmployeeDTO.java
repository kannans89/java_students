package com.techlabs.organization_hierarchy.elements;

public class EmployeeDTO {

	private String name;
	private String designation;
	private String manager;

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public String getManager() {
		return manager;
	}

	public EmployeeDTO(String name, String designation) {

		this.name = name;
		this.designation = designation;
	}

	public EmployeeDTO(String name, String designation, String manager) {

		this.name = name;
		this.designation = designation;
		this.manager = manager;
	}

}
