package com.techlabs.principles.srp.solution1.test;

import com.techlabs.principles.srp.solution1.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(5000, 4, "stationary");
		invoice.printDetails(invoice);
	}

}
