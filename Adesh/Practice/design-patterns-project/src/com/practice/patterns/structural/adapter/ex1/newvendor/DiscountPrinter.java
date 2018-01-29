package com.practice.patterns.structural.adapter.ex1.newvendor;

public class DiscountPrinter {
	public void printPdf(IDiscountable obj){
		System.out.println("\n******************************\nInvoice is in PDF format..\n*******************************\n");
		System.out.println("Invoice is printing...");
		obj.getDescription(); 	
		System.out.println("Total Discount = "+obj.calculateDiscount());
	}
}
