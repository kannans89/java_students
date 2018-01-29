package com.techlabs.srp.solution1;

public class Invoice {

	double subTotal;
	double taxRate;

	public Invoice(double subTotal, double taxRate) {
		this.subTotal = subTotal;
		this.taxRate = taxRate;
	}

	public double calculateTax() {
		return subTotal * taxRate / 100;
	}

	public double calculateTotal() {
		return subTotal + calculateTax();
	}

	public static void printInvoice(Invoice other) {
		System.out.println("Total is :" + other.calculateTotal());
	}
}
