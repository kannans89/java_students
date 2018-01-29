package com.techlabs.srp.solution2;

public class Invoice {

	double subTotal;
	double taxRate;

	public Invoice(double subTotal, double taxRate) {
		this.subTotal = subTotal;
		this.taxRate = taxRate;
	}

	double calculateTax() {
		return subTotal * taxRate / 100;
	}

	public double calculateTotal() {
		return subTotal + calculateTax();
	}

}
