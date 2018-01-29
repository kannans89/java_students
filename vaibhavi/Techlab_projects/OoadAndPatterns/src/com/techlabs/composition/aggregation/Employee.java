package com.techlabs.composition.aggregation;

public class Employee {
	
	private String name;
	private AddressInfo address;
	private InsuranceInfo insurance;
	
	public Employee(String name,String street,String city,String state,String pincode)
	{
		this.name=name;
		address=new AddressInfo();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setPincode(pincode);
		
		
	}
	
	public void setInsurance(InsuranceInfo insurance) {
		
      this.insurance=insurance;
	}

	@Override
	public String toString() {
		
		return "Employee [name=" + name + ", address=" + address
				+ ", insurance=" + insurance + "]";
	}
	

}
