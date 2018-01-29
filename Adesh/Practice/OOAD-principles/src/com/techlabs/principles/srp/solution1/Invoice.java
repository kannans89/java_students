package com.techlabs.principles.srp.solution1;

public class Invoice {
	private double tax;
	private double subTotal;
	private String description;

	public Invoice(double subTotal, double tax, String description) {
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

	public double calculateTotal() {
		return subTotal + calculateTax();
	}
	
	public void printDetails(Invoice invoice){
		System.out.println("This is the PDF format = ");
		System.out.println("subTotal is = "+invoice.subTotal);
		System.out.println("tax is = "+invoice.calculateTax());
		System.out.println("Total amount on given tax is = "+invoice.calculateTotal());
	}

}
