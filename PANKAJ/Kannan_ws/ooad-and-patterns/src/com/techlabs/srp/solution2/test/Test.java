package com.techlabs.srp.solution2.test;

import com.techlabs.srp.solution2.Invoice;
import com.techlabs.srp.solution2.InvoicePrinter;

public class Test {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(100, 5);

		InvoicePrinter.print(invoice);
	}

}
