package com.practice.patterns.structural.adapter.ex1.test;

import com.practice.patterns.structural.adapter.ex1.newvendor.DiscountPrinter;
import com.practice.patterns.structural.adapter.ex1.newvendor.Invoice;
import com.practice.patterns.structural.adapter.ex1.oldvendor.GoodsAdapter;

public class InvoiceTest {

	public static void main(String[] args) {
		DiscountPrinter printer = new DiscountPrinter();
		printer.printPdf(new Invoice("kannan", 2000));
		printer.printPdf(new GoodsAdapter(111, "Books", 6, 5000));
	}

}
