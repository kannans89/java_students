package com.techlabs.composition.aggregation;

public class AddressInfo {
	// Instance Variables
	private String employeeCity;
	private String employeeState;
	private String employeePincode;

	// Constructor
	public AddressInfo(String city, String state, String pincode) {
		employeeCity = city;
		employeeState = state;
		employeePincode = pincode;
	}

	// Methods
	public String getemployeeState() {
		return employeeCity;
	}

	public String getemployeeCity() {
		return employeeState;
	}

	public String getemployeePincode() {
		return employeePincode;
	}

	@Override
	public String toString() {
		return "\nCity :" + employeeCity + " \nState :"
				+ employeeState + " \nPincode : "+ employeePincode;
	}
	
}
