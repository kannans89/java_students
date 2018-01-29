package com.techlabs.composition.aggregation;

public class AddressInfo {
	
	private String city;
	private String state;
	private int pinNo;
	
	public AddressInfo(String city,String state,int pinNo){
		this.city=city;
		this.state=state;
		this.pinNo=pinNo;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public int getPinNumber(){
		return pinNo;
	}
	
	public void setCity(String city){
		this.city=city;
	}
	
	public void setState(String state){
		this.state=state;
	}
	
	public void setPinNo(int number){
		this.pinNo=number;
	}
	
	@Override
	public String toString(){
		StringBuilder details=new StringBuilder();
		details.append(city);
		details.append(state);
		details.append(pinNo);
		String detail=details.toString();
		return detail;
	}

}
