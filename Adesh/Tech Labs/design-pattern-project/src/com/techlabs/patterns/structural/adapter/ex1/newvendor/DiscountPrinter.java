package com.techlabs.patterns.structural.adapter.ex1.newvendor;

public class DiscountPrinter {
	
	public void printPdf(IDiscountable obj){
		System.out.println("\nInvoice is in PDF format..\n");
		System.out.println("Invoice is printing....");
		obj.getDescription();
		System.out.println("Total Discount is = "+obj.calculateDiscount());
	}
}
