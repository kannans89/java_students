package com.techlabs.principles.srp.solution2.test;

import com.techlabs.principles.srp.solution2.Invoice2;
import com.techlabs.principles.srp.solution2.InvoicePrinter;

public class Invoice2Test {

	public static void main(String[] args) {

		Invoice2 invoice = new Invoice2(100000, 8, "grocery");
		InvoicePrinter printer = new InvoicePrinter();

		printer.invoicePrinter(invoice);
	}

}
