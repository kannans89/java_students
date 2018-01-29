package com.techlabs.principles.srp.solution2;

public class Invoice2 {
	private double tax;
	private double subTotal;
	private String description;

	public Invoice2(double subTotal, double tax, String description) {
		this.subTotal = subTotal;
		this.tax = tax;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public double calculateTax() {
		return subTotal * (tax / 100);
	}

	public double getTotal() {
		return subTotal + calculateTax();
	}

}
