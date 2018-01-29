package com.techlabs.patterns.structural.composite.ex1.test;

import com.techlabs.patterns.structural.composite.ex1.Invoice;
import com.techlabs.patterns.structural.composite.ex1.LineItem;

public class TestInvoice {

	public static void main(String[] args) {
		
		Invoice bookInvoice = new Invoice("Book Invoice", "college invoice");
		Invoice phoneInvoice = new Invoice("Phone invoice", "shop invoice");
		Invoice smartPhoneInvoice = new Invoice("Smart Phone Invoice", "research invoice");
		Invoice mainInvoice = new Invoice("Main Invoice", "company's invoice");
		
		LineItem smartP1 = new LineItem(1001, "Apple", 6);
		LineItem smartP2 = new LineItem(1005, "Samsung", 8);
		
		LineItem ph1 = new LineItem(101, "Blackberry", 1);
		LineItem ph2 = new LineItem(102, "Micromax", 5);
		
		LineItem item1 = new LineItem(101, "Java", 3);
		LineItem item2 = new LineItem(2, "C++", 7);
		LineItem item3 = new LineItem(011, ".Net", 4);
		
		smartPhoneInvoice.addItems(smartP1);
		smartPhoneInvoice.addItems(smartP2);
		
		phoneInvoice.addItems(ph1);
		phoneInvoice.addItems(ph2);
		phoneInvoice.addItems(smartPhoneInvoice);
		
		bookInvoice.addItems(item1);
		bookInvoice.addItems(item2);
		bookInvoice.addItems(item3);
		
		mainInvoice.addItems(bookInvoice);
		mainInvoice.addItems(phoneInvoice);
		
		mainInvoice.printOrderDetails();
	}

}
