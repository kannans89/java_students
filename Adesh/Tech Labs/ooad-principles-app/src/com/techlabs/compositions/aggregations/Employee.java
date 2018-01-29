package com.techlabs.compositions.aggregations;

public class Employee {
	private String name;
	private AddressInfo address;
	private InsuranceInfo insurance;
	
	public Employee(String name, String city, String state, String pin){
		this.name = name;
		address = new AddressInfo(city, state, pin);
	}
	
	public String getName(){
		return name;
	}
	
	public void setInsurance(InsuranceInfo insurance){
		 this.insurance=insurance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName());
		builder.append(address.toString());
	
		if(insurance != null){
			 builder.append(insurance.toString());
		}
		return builder.toString();
	}
}
