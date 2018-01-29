package com.practice.patterns.structural.adapter.ex1.newvendor;

public class Invoice implements IDiscountable{
	private String name;
	private double billAmount;
	
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
	
	public double calculateDiscount(){
		return this.billAmount = (this.billAmount * 0.2);
	}
	
	public void getDescription(){
		System.out.println("Name = "+getName());
		System.out.println("Total bill amount = "+getBillAmount());
	}
}
