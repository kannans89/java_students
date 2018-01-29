package com.techlabs.patterns.structural.adapter;

public class Invoice implements IDiscount {
	
	private String customerName;
	private double billAmount;
	
	 public Invoice(String customerName,double billAmount) {
		
		this.billAmount=billAmount;
		this.customerName=customerName;
	}
	 
	 

	@Override
	public double getDiscount() {
		return billAmount*.50;
	}

}
