package com.techlabs.principles.srp.solution2.test;


import com.techlabs.principles.srp.solution2.Invoice;
import com.techlabs.principles.srp.solution2.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice bill = new Invoice(1000, 8,"Books");
		InvoicePrinter printer = new InvoicePrinter();
		printer.print(bill);
	}

}
