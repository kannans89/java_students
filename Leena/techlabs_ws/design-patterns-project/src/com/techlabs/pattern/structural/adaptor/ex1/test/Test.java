package com.techlabs.pattern.structural.adaptor.ex1.test;
import com.techlabs.pattern.structural.adaptor.ex1.newvendor.DiscountPrinter;
import com.techlabs.pattern.structural.adaptor.ex1.newvendor.Invoice;
import com.techlabs.pattern.structural.adaptor.ex1.oldvendor.Goods;

public class Test {

	public static void main(String[] args) {
		
		DiscountPrinter printer=new DiscountPrinter();
		printer.printPDF(new Invoice("Books", 500));
		System.out.println("----------------------------------------------------");
		printer.printPDF(new GoodsAdaptor(new Goods(101, "CD", 5, 20)));
	}

}
