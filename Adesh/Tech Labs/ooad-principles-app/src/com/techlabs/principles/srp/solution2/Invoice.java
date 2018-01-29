package com.techlabs.principles.srp.solution2;

public class Invoice {
	private double subTotal;
	private double tax;
	private String description;

	public Invoice(double subTotal, double tax, String description) {
		this.subTotal = subTotal;
		this.tax = tax;
		this.description = description;
	}

	public double calculateTax() {
		return subTotal * (tax / 100);
	}

	public double calculateTotal() {
		return subTotal + calculateTax();
	}

	public double getTax() {
		return tax;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double getTotal() {
		return calculateTotal();
	}

	public String getDescription() {
		return description;
	}

}
