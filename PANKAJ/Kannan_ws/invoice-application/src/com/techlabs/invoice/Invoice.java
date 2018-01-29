package com.techlabs.invoice;

import java.util.HashSet;
import java.util.Set;

public class Invoice {
	Set<LineItem> setOfItem = new HashSet<LineItem>();

	public void addLineItem(LineItem item) {
		setOfItem.add(item);
	}

	public Set<LineItem> readLineItem() {
		return setOfItem;

	}

	public void updateLineItem(LineItem oldItem, LineItem newItem) {
		if (setOfItem.contains(oldItem)) {
			oldItem.setName(newItem.getName());
			oldItem.setQty(newItem.getQty());
			oldItem.setUnitPrice(newItem.getUnitPrice());
				
		}
	}

	public void deleteLineItem(LineItem item) {
		if (setOfItem.contains(item)) {
			setOfItem.remove(item);
		}

	}
	
}
