package com.techlabs.pattern.structural.adaptor.ex1.newvendor;

public class DiscountPrinter {
	
	public void printPDF(IDiscountable vendor){
		System.out.println("Printing the current Product details in PDF format..");
		System.out.print(vendor.getProductDescription());
		System.out.println(vendor.calculateDiscount());
		
	}
	
	

}
