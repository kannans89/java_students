package com.techlabs.principles.srp.solution1.test;

import com.techlabs.principles.srp.solution1.Invoice;

public class TestInvoice {

	public static void main(String[] args) {

		Invoice bookInvoice = new Invoice(500, 8, "Books");
		bookInvoice.printInvoiceDetails(bookInvoice);

	}

}
