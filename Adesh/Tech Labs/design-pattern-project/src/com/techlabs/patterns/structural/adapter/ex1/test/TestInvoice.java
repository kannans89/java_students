package com.techlabs.patterns.structural.adapter.ex1.test;

import com.techlabs.patterns.structural.adapter.ex1.newvendor.DiscountPrinter;
import com.techlabs.patterns.structural.adapter.ex1.newvendor.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		DiscountPrinter printer = new DiscountPrinter();
		printer.printPdf(new Invoice("books", 5000));
		printer.printPdf(new GoodsAdapter(101, "mobile", 6, 5000));
	}

}
