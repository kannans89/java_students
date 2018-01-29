package com.techlabs.patterns.behavioral.adapter.ex1.test;

import com.techlabs.patterns.behavioral.adapter.ex1.newvender.DiscountPrinter;
import com.techlabs.patterns.behavioral.adapter.ex1.newvender.Invoice;

public class Test {

	public static void main(String[] args) {
		DiscountPrinter printer = new DiscountPrinter();

		printer.printPDF(new Invoice("Smart Phone", 30000));
		printer.printPDF(new GoodsAdapter(101, "HeadPhones", 20, 100));

	}

}
