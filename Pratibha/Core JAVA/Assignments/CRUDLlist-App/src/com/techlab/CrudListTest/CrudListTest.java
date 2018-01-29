package com.techlab.CrudListTest;

import com.techlab.CrudList.*;

import java.util.ArrayList;
import java.util.List;

public class CrudListTest {

	public static void main(String[] args) {
		List<LineItem> list = new ArrayList<LineItem>();
		list.add(new LineItem(1, "Apple", 5, 20));
		list.add(new LineItem(2, "Mango", 10, 30));
		list.add(new LineItem(3, "Orange", 7, 12));
		callPrintInfo(list);
		list.set(2, new LineItem(10, "Banana", 12, 3));
		callPrintInfo(list);
		list.remove(1);
		callPrintInfo(list);

	}

	public static void callPrintInfo(List<LineItem> list) {
		for (Object item : list) {
			LineItem temp = (LineItem) item;
			printInfo(temp);
		}
	}

	public static void printInfo(LineItem temp) {
		System.out.println("ID:" + temp.getId() + "\nName:" + temp.getName()
				+ "\nQuantity:" + temp.getQuantity() + "\nPrice:"
				+ temp.getPrice() + "\nTotal Price:"
				+ temp.calculateTotalPrice() + "\n");

	}
}
