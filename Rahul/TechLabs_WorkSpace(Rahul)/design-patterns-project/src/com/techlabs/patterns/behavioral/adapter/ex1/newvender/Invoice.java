package com.techlabs.patterns.behavioral.adapter.ex1.newvender;

public class Invoice implements IDiscountable {

	// Ivars
	private String productName;
	private double billAmount;
	
	//constructor
	public Invoice(String name,double amount){
		productName = name;
		billAmount = amount;
	}

	@Override
	public double calculateDiscount() {

		return billAmount * (20.0 / 100);
	}

	public String getProductName() {
		return productName;
	}

}
