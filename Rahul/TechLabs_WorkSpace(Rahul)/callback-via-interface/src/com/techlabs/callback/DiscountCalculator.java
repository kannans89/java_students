package com.techlabs.callback;

public class DiscountCalculator {
	// Constructor
	public DiscountCalculator(double amt, String pName, IDiscountRate rate) {
		billAmount = amt;
		productName = pName;
		productRate = rate;
	}

	// Method
	public double calculateDiscount() {
		double discount = (billAmount * (productRate.getRate() / 100));

		return discount;
	}

	public double payableAmount(){
		return (billAmount - this.calculateDiscount());
	}

	public String getProductName() {
		return productName;
	}

	// Instance Variables
	private double billAmount;
	private String productName;
	private IDiscountRate productRate;
}
