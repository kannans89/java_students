package com.techlabs.principles.srp.solution1;

public class Test {

	public static void main(String[] args) {
		
		Invoice bookInvoice=new Invoice(1000, 8,"Books");
		Invoice.printInvoice(bookInvoice);
		
		Invoice pens=new Invoice(6000, 9, "Pen");
		Invoice.printInvoice(pens);
		
	}

}
