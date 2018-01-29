package com.techlabs.srp.solution1.test;

import com.techlabs.srp.solution1.Invoice;

public class Test {

	public static void main(String[] args) {

		Invoice invoice =new Invoice(100,5);
		
		Invoice.printInvoice(invoice);
	}

}
