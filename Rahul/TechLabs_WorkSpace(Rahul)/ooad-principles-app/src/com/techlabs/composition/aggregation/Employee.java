package com.techlabs.composition.aggregation;

public class Employee {
	//Instance Variables
	private String employeeName;
	private AddressInfo employeeAddress;
	private InsuranceInfo employeeInsuranceInfo;
	
	//constructor
	public Employee(String name,String city,String state,String pincode){
		employeeName = name;
		employeeAddress = new AddressInfo(city, state, pincode);
	}
	
	//Methods
	public void setInsuranceInfo(String id,String name){
		employeeInsuranceInfo = new InsuranceInfo(id, name);
	}
	public InsuranceInfo getInsuranceInfo(){
		return employeeInsuranceInfo;
	}

	@Override
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append("Employee Name :"+employeeName+"\n\nEmployee Address -->"+employeeAddress);
		if(getInsuranceInfo() != null){
			data.append(" \n\nInsurance Info -->"+getInsuranceInfo());
			String employeeInfo = data.toString();
			return employeeInfo;
		}else{
			String employeeInfo = data.toString();
			return employeeInfo;
		}		
				
	}
	
	
	
}
