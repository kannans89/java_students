package com.techlabs.principles.srp.solution1.test;

import com.techlabs.principles.srp.solution1.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice bill = new Invoice(1000, 8,"Books");
		Invoice.printInvoiceDetails(bill);

	}

}
