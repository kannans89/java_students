package com.techlabs.employee.aggregationcomposition;
public class Employee {
	
	private String name;
	private AddressInfo address;
	private InsuranceInfo insurance;
	
	public Employee()
	{
		System.out.println("Inside default constructor");
	}
	public Employee(AddressInfo address)
	{
		
		System.out.println("Inside overloaded constructor");
		this.address=address;
		
	}
	
	public void setInsurance(InsuranceInfo  insurance) {
		
      this.insurance=insurance;
      System.out.println("Inside set insurance");
	}

	public InsuranceInfo  getInsurance() {
		return insurance;
	}
	public AddressInfo getAddress() {
		return address;
	}
	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	
	

}
