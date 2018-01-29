package com.techlabs.callback;

public class DiscountCalculator {
	
	private double billAmount;
	private String productName;
	protected IDiscountRate rate;
	
	//an object of interface will pass the reference to the constructor
	public DiscountCalculator(double amt,String name,IDiscountRate rate){
		this.billAmount=amt;
		this.productName=name;
		this.rate=rate;
	}
	
	public double calculate(){
		return (billAmount-(billAmount*rate.getRate()));
	}
	
	public String getProductName(){
		return productName;
	}
	
	public double getBalance(){
		return billAmount;
	}

	
	

}
