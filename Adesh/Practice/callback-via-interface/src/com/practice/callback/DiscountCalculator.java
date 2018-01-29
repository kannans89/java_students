package com.practice.callback;

public class DiscountCalculator {
	private double amount;
	private String name;
	protected IDiscountRate rate;
	
	public DiscountCalculator(double amount, String name, IDiscountRate rate){
		this.amount=amount;
		this.name=name;
		this.rate=rate;
	}
	
	public String getName(){
		return name;
	}
	
	public double calculate(IDiscountRate rate){
		return amount-(amount*rate.getRate());
	}

}
