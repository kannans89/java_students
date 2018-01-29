package com.techlabs.callback;

public class DiscountCalculator {
	private double amount;
	private String name;
	private IDiscountRate rate;

	public DiscountCalculator(double amount, String name, IDiscountRate rate) {
		this.amount = amount;
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public double calculate() {
		return amount - (amount * rate.getRate());
	}

}
