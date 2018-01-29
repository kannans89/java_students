package com.techlabs.principles.srp.solution2.test;

import com.techlabs.principles.srp.solution2.Invoice;
import com.techlabs.principles.srp.solution2.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice bookInvoice = new Invoice(1000, 5, "books");
		InvoicePrinter printer = new InvoicePrinter();
		printer.printInvoiceDetails(bookInvoice);
	}

}
