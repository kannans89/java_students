package com.techlabs.patterns.structural.adapter.test;

import com.techlabs.patterns.structural.adapter.DiscountPrinter;
import com.techlabs.patterns.structural.adapter.LineItemAdapter;

public class Test {

	public static void main(String args[]){
		
		DiscountPrinter printer =new DiscountPrinter();
		printer.print(new LineItemAdapter("Books", 2, 100));
		
	}
}