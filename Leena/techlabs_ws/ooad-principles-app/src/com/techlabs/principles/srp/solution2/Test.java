package com.techlabs.principles.srp.solution2;

public class Test {

	public static void main(String[] args) {
		
		Invoice bookeInvoice=new Invoice(1000, 8, "Books");
		InvoicePrinter printer=new InvoicePrinter();
		printer.printInvoice(bookeInvoice);
		System.out.println("=====================================");
		Invoice pens=new Invoice(2000, 8, "Pen");
		InvoicePrinter printer1=new InvoicePrinter();
		printer1.printInvoice(pens);
	}

}
