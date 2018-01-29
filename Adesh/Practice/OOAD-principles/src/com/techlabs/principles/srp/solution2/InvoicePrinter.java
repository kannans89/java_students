package com.techlabs.principles.srp.solution2;

public class InvoicePrinter {
	
	public void invoicePrinter(Invoice2 invoice) {
		System.out.println("Invoice XML format here:");
		System.out.println("Invoice Description is here = "
				+ invoice.getDescription());
		System.out.println("Total Tax is = " + invoice.calculateTax());
		System.out.println("Total amount with tax is = " + invoice.getTotal());
	}

}
