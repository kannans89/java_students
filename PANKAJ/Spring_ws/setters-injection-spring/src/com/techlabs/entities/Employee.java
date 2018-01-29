package com.techlabs.entities;

public class Employee {

	AddressInfo address;
	InsuranceInfo insurance;

	public Employee(AddressInfo address) {
		this.address = address;
	}

	public InsuranceInfo getInsurance() {
		return insurance;
	}

	public void setInsurance(InsuranceInfo insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return address.toString() + insurance.toString();
	}
}
