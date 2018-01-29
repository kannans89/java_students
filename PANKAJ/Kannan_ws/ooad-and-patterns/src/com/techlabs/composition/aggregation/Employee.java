package com.techlabs.composition.aggregation;

public class Employee {

	String name;
	AddressInfo address;
	InsuranceInfo insurance;

	public Employee(String name, String street, String city, String state,
			int pincode) {
		this.name = name;
		address = new AddressInfo(street, city, state, pincode);
	}

	public void setInsuranceInfo(InsuranceInfo insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		if(insurance!=null)
		return "Employee [name=" + name + ",\n address=" + address
				+ ",\n insurance=" + insurance + "]";
		else
			return "Employee [name=" + name + ",\n address=" + address +"]";
	}

}
