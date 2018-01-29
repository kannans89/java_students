package com.techlabs.srp.refactored;

public class InvoicePrint {

	public static void print(Invoice invoice) {
		System.out.println("Id: " + invoice.getId() + " Description: "
				+ invoice.getDescription() + " Total cost: "
				+ invoice.calcTotal());
	}
}
