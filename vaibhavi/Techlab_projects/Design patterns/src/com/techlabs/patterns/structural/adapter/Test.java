package com.techlabs.patterns.structural.adapter;

public class Test {

	public static void main(String[] args) {

		DiscountPrinter printer=new DiscountPrinter();
		printer.print(new Invoice("Vaibhavi",5000));
		printer.print(new LineItemAdapter("Books", 5, 100));
	}

}
