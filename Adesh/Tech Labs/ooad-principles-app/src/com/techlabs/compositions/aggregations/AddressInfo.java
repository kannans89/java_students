package com.techlabs.compositions.aggregations;

public class AddressInfo {
	private String city;
	private String state;
	private String pin;
	public AddressInfo(String city, String state, String pin){
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public String getPin(){
		return pin;
	}

	public String toString() {
		return "\ncity = " + city + "\nstate = " + state + "\npin = "+ pin;
	}

}
