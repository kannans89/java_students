package com.techlabs.composition.aggregation;

public class Employee {
	
	private String name;
	private AddressInfo address;
	private InsuarranceInfo insurance;
	
	public Employee(String name, String city,String state,int pinno){
		this.name=name;
		address=new AddressInfo(city, state, pinno);
	}
	
	public void setInsurance(InsuarranceInfo insurance){
		this.insurance=insurance;
	}
	
	@Override
	public String toString(){
		StringBuilder details=new StringBuilder();
		details.append("Hello, "+name+"\n");
		details.append("city is : "+address.getCity()+"\n");
		details.append("with state :"+address.getState()+"\n");
		details.append("pinNumber :"+address.getPinNumber()+"\n");
		if(insurance!=null){
			details.append("You have a policy also ur id is : "+insurance.getPolicyId()+"\n");
			details.append("with name :"+insurance.getPolicyName());
		}
		else{
			details.append("You don't have any policy");
		}
		
		String detail=details.toString();
		return detail;
	}

}
