package lineItemTest;

import lineItem.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		LineItem li1 = new LineItem(1, "Pratibha", 5, 100);
		LineItem li2 = new LineItem(2, "Shweta", 5, 222);
		System.out.println(li1);
		System.out.println(li1.getCount());
		System.out.println(li2.getCount());
	}

}
