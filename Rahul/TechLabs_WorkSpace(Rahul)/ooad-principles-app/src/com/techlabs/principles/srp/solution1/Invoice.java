package com.techlabs.principles.srp.solution1;


public class Invoice {
	//Instance Variables
	private double subTotal;
	private double taxOnsubTotal;
	private String product;
	
	//Constructor
	public Invoice(double amount,double tax,String prod){
		subTotal = amount;
		taxOnsubTotal = tax;		
		product = prod;
	}
	
	//Methods
	
	public double calculateTax(){
		return (subTotal*(taxOnsubTotal/100));
	}
	public double calculateTotal(){
		return (subTotal+calculateTax());
	}
	public double getsubTotal(){
		return subTotal;
	}
	public String getproduct(){
		return product;
	}
	public static void printInvoiceDetails(Invoice invoice){
		System.out.println("The Invoice for "+invoice.product);
		System.out.println("Subtotal :"+invoice.getsubTotal());
		System.out.println("Tax :"+invoice.calculateTax());
		System.out.println("Total Amount to pay :- "+invoice.calculateTotal());
	}
}
