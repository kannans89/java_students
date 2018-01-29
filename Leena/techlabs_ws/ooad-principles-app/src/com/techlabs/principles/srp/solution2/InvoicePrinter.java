package com.techlabs.principles.srp.solution2;

public class InvoicePrinter {
	
	
	public void printInvoice(Invoice invoice){
			System.out.println("Printing your "+invoice.getDescription()+" Invoice in PDF format :");
			System.out.println("SubAmount is :"+invoice.getSubtotal());
			System.out.println("Your Tax is :"+invoice.getTax());
			System.out.println("Your Grand Total is :"+invoice.calculateTotal());
		}
	
	
	}

