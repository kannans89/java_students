package com.techlabs.factory;

public class Sim {
	private Vendor vendor;

	public Sim() {
		// TODO Auto-generated constructor stub
	}

	public Sim(Vendor vendor) {
		this.vendor = vendor;
		System.out.println("Inside Sim Constructor");
	}

	public void getSim() {
		this.vendor.getVendor();
		System.out.println("Inside Sim function");
	}

}
