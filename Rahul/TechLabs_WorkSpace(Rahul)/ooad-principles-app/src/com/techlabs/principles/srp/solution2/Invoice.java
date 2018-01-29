	package com.techlabs.principles.srp.solution2;


public class Invoice {
	private double subTotal;
	private double taxOnsubTotal;
	private String product;
	
	//Constructor
	public Invoice(double amount,double tax,String prod){
		subTotal = amount;
		taxOnsubTotal = tax;		
		product = prod;
	}
	
	//Methods
	
	public double calculateTax(){
		return (subTotal*(taxOnsubTotal/100));
	}
	public double calculateTotal(){
		return (subTotal+calculateTax());
	}
	public double getsubTotal(){
		return subTotal;
	}
	public String getproduct(){
		return product;
	}
	public double gettax(){
		return taxOnsubTotal;
	}
	
}
