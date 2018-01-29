package com.techlabs.employee.aggregationcomposition;

public class AddressInfo {
	
	String street;
	String city;
	String state;
	String pincode;
	
	public AddressInfo(String street,String city,String state,String pincode)
	{
		this.city=city;
		this.pincode=pincode;
		this.street=street;
		this.state=state;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	@Override
	public String toString() {
		return "AddressInfo [street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}

}
