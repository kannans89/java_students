package com.techlabs.principles.srp.solution1;

public class Invoice {
	
	private double subtotal;
	private double tax;
	public String description;
	
	public Invoice(double amount,double tax,String description){
		this.subtotal=amount;
		this.tax=tax;
		this.description=description;
	}
	
	public double calculateTax(){
		return this.subtotal*(tax/100);
	}
	
	public double calculateTotal(){
		return this.subtotal+calculateTax();
	}
	
	public static void printInvoice(Invoice invoice){
		System.out.println("Printing your "+invoice.description+" Invoice in PDF format :");
		System.out.println("SubAmount is :"+invoice.subtotal);
		System.out.println("Tax is :"+invoice.tax);
		System.out.println("Your Grand Total is :"+invoice.calculateTotal());
	}

}
