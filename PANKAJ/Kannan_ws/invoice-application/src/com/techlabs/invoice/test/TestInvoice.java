package com.techlabs.invoice.test;

import java.util.Set;

import com.techlabs.invoice.Invoice;
import com.techlabs.invoice.LineItem;

public class TestInvoice {

	public static void main(String[] args) {

		Invoice invoiceObj = new Invoice();

		LineItem item1 = new LineItem("books", 1, 5, 100);
		LineItem item2 = new LineItem("Laptop", 2, 5, 25000);
		LineItem item3 = new LineItem("mobile", 3, 5, 10000);

		invoiceObj.addLineItem(item1);
		invoiceObj.addLineItem(item2);
		invoiceObj.addLineItem(item3);
		invoiceObj.addLineItem(new LineItem("pen",4,10,10));
		invoiceObj.addLineItem(new LineItem("Pencil",5,15,15));
		invoiceObj.addLineItem(new LineItem("Eraser",6,20,5));
		invoiceObj.addLineItem(new LineItem("Bag",7,3,400));
		
		Set<LineItem> setOfLineItem = invoiceObj.readLineItem();
		System.out.println(setOfLineItem);

		System.out.println("After Updating:");
		LineItem item4 = new LineItem("Tablet", 2, 4, 12000);
		invoiceObj.updateLineItem(item2, item4);
		setOfLineItem = invoiceObj.readLineItem();
		System.out.println(setOfLineItem);

		System.out.println("After Deleting:");
		invoiceObj.deleteLineItem(item1);
		setOfLineItem = invoiceObj.readLineItem();
		System.out.println(setOfLineItem);

	}

}
