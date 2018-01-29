package com.techlabs.collections.comparetosort;

import java.util.Comparator;

import com.techlabs.collections.LineItem;

public class ProductQuantityCompare implements Comparator<LineItem> {
	@Override
	public int compare(LineItem lineItemObj1, LineItem LineItemObj2) {

		if (lineItemObj1.getproductQuantity() == LineItemObj2
				.getproductQuantity()) {
			return 0;
		} else if (lineItemObj1.getproductQuantity() > LineItemObj2
				.getproductQuantity()) {
			return 1;
		} else {
			return -1;
		}

	}

}
