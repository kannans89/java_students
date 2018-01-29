package com.techlabs.patterns.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent {

	// Ivars
	private String invoiceName;
	private String invoiceDescription;
	private List<IOrderComponent> invoiceItems;

	// constructor
	public Invoice(String name, String description) {
		invoiceName = name;
		invoiceDescription = description;
		invoiceItems = new ArrayList<IOrderComponent>();
	}

	// methods
	public String getinvoiceName() {
		return invoiceName;
	}

	public String getinvoiceDescription() {
		return invoiceDescription;
	}

	public void add(IOrderComponent currentItem) {
		invoiceItems.add(currentItem);
	}

	@Override
	public void printOrderDetails() {
		System.out.println("Print Invoice : " + getinvoiceName());
		System.out.println("Description : " + getinvoiceDescription());
		System.out.println("ID	  Name	  Quantity	  Price");
		System.out.println("-------------------------------------------");
		for (IOrderComponent currentItem : invoiceItems) {
			
			currentItem.printOrderDetails();
		}
		System.out.println("=============================================");

	}

}
