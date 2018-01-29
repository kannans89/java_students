package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class TestInvoice {

	public static void main(String[] args) {

		Invoice invoiceOne = new Invoice(1, "Football", 400, 20);
		Invoice invoiceTwo = new Invoice(2, "VolleyBall", 300, 10);
		invoiceOne.print();
		invoiceTwo.print();
	}

}
