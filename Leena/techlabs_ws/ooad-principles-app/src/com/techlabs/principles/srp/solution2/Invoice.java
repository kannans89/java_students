package com.techlabs.principles.srp.solution2;

public class Invoice {
	private double subtotal;
	private double tax;
	private String description;
	
	public Invoice(double amount,double tax,String description){
		this.subtotal=amount;
		this.tax=tax;
		this.description=description;
	}
	
	public double calculateTax(){
		return this.subtotal*(tax/100);
	}
	
	public double calculateTotal(){
		return this.subtotal+calculateTax();
	}
	
	public double getSubtotal(){
		return subtotal;
	}
	
	public double getTax(){
		return tax;
	}
	
	public String getDescription(){
		return description;
	}
}
