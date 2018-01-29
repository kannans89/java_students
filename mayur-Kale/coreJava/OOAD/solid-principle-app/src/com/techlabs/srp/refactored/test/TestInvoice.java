package com.techlabs.srp.refactored.test;

import com.techlabs.srp.refactored.Invoice;
import com.techlabs.srp.refactored.InvoicePrint;

public class TestInvoice {

	public static void main(String[] args) {

		Invoice invoiceOne = new Invoice(1, "Football", 400, 20);
		Invoice invoiceTwo = new Invoice(2, "VolleyBall", 300, 10);
		InvoicePrint.print(invoiceOne);
		InvoicePrint.print(invoiceTwo);
	}

}
