package com.techlabs.collections.comparetosort;

import java.util.Comparator;

import com.techlabs.collections.LineItem;

public class ProductPriceCompare implements Comparator<LineItem> {
	@Override
	public int compare(LineItem lineItemObj1, LineItem LineItemObj2) {

		if (lineItemObj1.getproductPrice() == LineItemObj2.getproductPrice()) {
			return 0;
		} else if (lineItemObj1.getproductPrice() > LineItemObj2
				.getproductPrice()) {
			return 1;
		} else {
			return -1;
		}

	}

}
