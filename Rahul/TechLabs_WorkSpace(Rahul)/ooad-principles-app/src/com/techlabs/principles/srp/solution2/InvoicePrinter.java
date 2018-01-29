package com.techlabs.principles.srp.solution2;

public class InvoicePrinter {
	
	public void print(Invoice invoiceToPrint){
		System.out.println("The Invoice for "+invoiceToPrint.getproduct());
		System.out.println("Subtotal :"+invoiceToPrint.getsubTotal());
		System.out.println("Tax :"+invoiceToPrint.calculateTax());
		System.out.println("Total Amount to pay :- "+invoiceToPrint.calculateTotal());
		
	}

}
