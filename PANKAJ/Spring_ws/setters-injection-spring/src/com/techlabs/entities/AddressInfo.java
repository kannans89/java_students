package com.techlabs.entities;

public class AddressInfo {

	String street;
	String city;
	String state;
	int pincode;

	AddressInfo(String street, String city, String state, int pincode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressInfo [street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}

}
