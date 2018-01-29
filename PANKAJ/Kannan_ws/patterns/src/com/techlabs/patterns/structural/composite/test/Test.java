package com.techlabs.patterns.structural.composite.test;

import com.techlabs.patterns.structural.composite.Invoice;
import com.techlabs.patterns.structural.composite.LineItem;

public class Test {

	public static void main(String[] args) {

		Invoice mainInvoice = new Invoice("Main Invoice");

		Invoice bookInvoice = new Invoice("Book Invoice");
		bookInvoice.add(new LineItem(10, "C++", 100));
		bookInvoice.add(new LineItem(11, "java", 200));
		bookInvoice.add(new LineItem(12, "hadoop", 500));
		bookInvoice.add(new LineItem(13, "ruby", 1000));

		mainInvoice.add(bookInvoice);

		Invoice smartPhInv = new Invoice("Smart Phone Invoice");
		smartPhInv.add(new LineItem(50, "Apple", 50000));
		smartPhInv.add(new LineItem(51, "Samsung", 20000));

		Invoice phoneInvoice = new Invoice("Phone Invoice");
		phoneInvoice.add(new LineItem(20, "Nokia", 5000));
		phoneInvoice.add(new LineItem(21, "BlackBerry", 15000));
		phoneInvoice.add(smartPhInv);
		mainInvoice.add(phoneInvoice);

		mainInvoice.displayInfo();

	}

}
