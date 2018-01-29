package com.techlabs.compositions.aggregations;

public class AddressInfo {
	private String city;
	private String state;
	private String pin;

	public AddressInfo(String city, String state, String pin) {
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "\nAddress Info==>\ncity = " + city + "\nstate = " + state + "\npin = " + pin;
	}

}
