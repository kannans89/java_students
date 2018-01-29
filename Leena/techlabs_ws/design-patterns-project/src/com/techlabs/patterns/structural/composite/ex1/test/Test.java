package com.techlabs.patterns.structural.composite.ex1.test;

import com.techlabs.patterns.structural.composite.ex1.Invoice;
import com.techlabs.patterns.structural.composite.ex1.LineItem;

public class Test {
	
	public static void main(String[] args) {
		Invoice mainInvoice=new Invoice("Main Invoice", "This is main invoice");
		Invoice bookInvoice=new Invoice("Book Invoice", "This is a book invoice");
		Invoice phoneInvoice=new Invoice("Phone invoice", "This is a phone invoice");
		Invoice smartPhoneInvoice=new Invoice("SmartPhone Invoice", "This is Smart phone Invoice");
		LineItem item1=new LineItem(01, "C#", 5, 500);
		LineItem item2=new LineItem(02, "C++", 2, 4);
		LineItem item3=new LineItem(03, "JAVA", 1, 700);
		LineItem item4=new LineItem(03, "BlackBerry",1 ,8000);
		LineItem item5=new LineItem(05, "Micromax", 2, 10000);
		LineItem item6=new LineItem(06, "Apple", 1, 50000);
		LineItem item7=new LineItem(07, "SamSung", 2, 12000);
		
		mainInvoice.addItems(bookInvoice);
		bookInvoice.addItems(item1);
		bookInvoice.addItems(item2);
		bookInvoice.addItems(item3);
		mainInvoice.addItems(phoneInvoice);
		phoneInvoice.addItems(item4);
		phoneInvoice.addItems(item5);
		phoneInvoice.addItems(smartPhoneInvoice);
		smartPhoneInvoice.addItems(item6);
		smartPhoneInvoice.addItems(item7);
		
		
		
		mainInvoice.printOrderDetails();
		
		
	}

}
