package com.techlabs.srp.solution2;

public class InvoicePrinter {

	public static void print(Invoice invoice) {
		System.out.println("Total is :" + invoice.calculateTotal());
	}

}
