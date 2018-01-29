package com.techlabs.collections.comparetosort;

import java.util.Comparator;

import com.techlabs.collections.LineItem;

public class ProductNameCompare implements Comparator<LineItem> {

	@Override
	public int compare(LineItem lineItemObj1, LineItem lineItemObj2) {
		return lineItemObj1.getProductName().compareTo(
				lineItemObj2.getProductName());
	}

}
