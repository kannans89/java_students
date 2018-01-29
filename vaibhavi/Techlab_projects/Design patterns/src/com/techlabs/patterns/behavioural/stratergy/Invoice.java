package com.techlabs.patterns.behavioural.stratergy;

public class Invoice {
	
	private String name;
	private double billAmount;
	private IDiscountStratergy stratergy;
	
	public Invoice(String name,double billAmount,IDiscountStratergy stratergy)
	{
		this.stratergy=stratergy;
		this.name=name;
		this.billAmount=billAmount;
	}
	
	public double calculateTotal()
	{
		return billAmount-(billAmount*stratergy.getDiscount());
	}

}
