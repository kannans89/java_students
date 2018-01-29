package com.techlabs.patterns.behavioral.adapter.ex1.newvender;

public class DiscountPrinter {
	
	public void printPDF(IDiscountable objectToPrint){
		System.out.println("Printing Discount Details........");
		System.out.println("Product :"+objectToPrint.getProductName());
		System.out.println("Discount on Total Price : Rs."+objectToPrint.calculateDiscount());
		
		System.out.println("______________________________________________");
	}

}
