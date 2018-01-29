package com.techlabs.patterns.structural.adapter.ex1.newvendor;

public class Invoice implements IDiscountable{
	private String name;
	public double billAmount;
	
	public Invoice(String name, double billAmount){
		this.name = name;
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public double calculateDiscount() {
		this.billAmount = (this.billAmount * 0.20);
		return billAmount;
	}

	public void getDescription() {
		System.out.println("Name = "+getName());
		System.out.println("Bill amount = "+getBillAmount());
	}
		
}
