package com.techlabs.principles.srp.solution1;

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

	public void printInvoiceDetails(Invoice invoice) {
		System.out.println("printing invoice in pdf format:");
		System.out.println("tax = " + invoice.tax);
		System.out.println("subtotal = " + invoice.subTotal);
		System.out.println("total = " + invoice.calculateTotal());
		System.out.println("Description of the book = " + invoice.description);
	}
}
