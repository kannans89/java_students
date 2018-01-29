package com.techlabs.principles.srp.solution2;

public class InvoicePrinter {
	public void printInvoiceDetails(Invoice invoice) {
		System.out.println("printing invoice in pdf format:");
		System.out.println("tax = " + invoice.getTax());
		System.out.println("subtotal = " + invoice.getSubTotal());
		System.out.println("total = " + invoice.calculateTotal());
		System.out.println("Description of the book = "
				+ invoice.getDescription());
	}

}
