package com.techlabs.invoice.lineitem;

import java.util.HashSet;

public class InVoice {

	HashSet<LineItem> lineitems = new HashSet<LineItem>();

	public HashSet<LineItem> addLineItems(LineItem item) {

		lineitems.add(item);
		return lineitems;
	}

	public HashSet<LineItem> deleteLineItems(LineItem item) {
		lineitems.remove(item);
		return lineitems;
	}

	public Boolean searchLineItems(LineItem item) {
		if (lineitems.contains(item)) {
			return true;
		} else {
			return false;
		}
	}

	public HashSet<LineItem> updateLineItems(LineItem oldItem, LineItem newItem) {
		if (lineitems.contains(oldItem)) {

			oldItem.setName(newItem.getName());
			oldItem.setQuantity(newItem.getQuantity());
			oldItem.setUnitprice(newItem.getUnitprice());

		}

		return lineitems;
	}
}
