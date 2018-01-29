package com.techlabs.patterns.behavioral.strategy;

public class Invoice {

	String custName;
	double billAmt;
	IdiscountStrategy strategy;

	public Invoice(double billAmt, IdiscountStrategy strategy) {
		this.strategy = strategy;
		this.billAmt=billAmt;
	}

	public double calcTotal() {
		return billAmt - billAmt * strategy.getDiscountRate();
	}
}
