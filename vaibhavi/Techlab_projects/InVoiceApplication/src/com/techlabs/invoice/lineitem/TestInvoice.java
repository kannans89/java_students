package com.techlabs.invoice.lineitem;

public class TestInvoice {

	public static void main(String[] args) {

		LineItem li1 = new LineItem("Book", 1, 2, 500);
		LineItem li2 = new LineItem("laptop", 2, 3, 500);
		LineItem li3 = new LineItem("note", 1, 4, 600);
		LineItem li4 = new LineItem("pen", 3, 4, 600);

		InVoice invoice = new InVoice();
		invoice.addLineItems(li1);
		invoice.addLineItems(li2);
		invoice.updateLineItems(li1, li3);
		invoice.addLineItems(li4);
		System.out.println(invoice.lineitems);

	}

}
