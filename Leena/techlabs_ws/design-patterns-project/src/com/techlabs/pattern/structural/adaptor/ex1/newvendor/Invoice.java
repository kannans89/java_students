package com.techlabs.pattern.structural.adaptor.ex1.newvendor;

public class Invoice implements IDiscountable{
	
	private String productname;
	private double billAmount;
	
	public Invoice(String name,double amount) {
	this.productname=name;
	this.billAmount=amount;
	}
	
	@Override
	public double calculateDiscount(){
		//System.out.println(" for new vendor you are having 20% discount");
		return billAmount*0.20;
	}
	
	public String getName(){
		return productname;
	}
	
	@Override
	public String getProductDescription(){
		return "Total price for "+getName()+" is :";
				
	}


}
