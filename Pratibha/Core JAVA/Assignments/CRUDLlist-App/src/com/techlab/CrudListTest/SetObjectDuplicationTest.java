package com.techlab.CrudListTest;

import java.util.HashSet;
import java.util.Set;
import com.techlab.CrudList.LineItem;

@SuppressWarnings("serial")
public class SetObjectDuplicationTest<T> extends HashSet<LineItem> {

	public static void main(String[] args) {
		Set<LineItem> cart = new HashSet<LineItem>();
		cart.add(new LineItem(1, "Apple", 5, 20));
		cart.add(new LineItem(1, "Apple", 5, 20));
		cart.add(new LineItem(2, "Pynapple", 5, 20));
		System.out.println("size=" + cart.size());

		for (Object obj : cart) {
			LineItem item = (LineItem) obj;
			System.out.println(item);
		}
	}

}
