package com.techlabs.shopping.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
	private Map<String, LineItem> lineItemMap;
	private List<LineItem> lineItemList;
	private double checkoutPrice;

	public Order() {
		checkoutPrice = 0;
		lineItemMap = new HashMap<String, LineItem>();
		lineItemList = new ArrayList<LineItem>();
	}

	public void addToLineItem(Product product, String productName, int quantity) {
		if (lineItemMap.containsKey(productName)) {
			quantity += lineItemMap.get(productName).getQuantity();
			lineItemMap.get(productName).setQuantity(quantity);
		}
		LineItem item = new LineItem(quantity, product);
		lineItemMap.put(productName, item);
	}

	public List<LineItem> getLineItemToList() {
		lineItemList.clear();
		for (Map.Entry<String, LineItem> element : lineItemMap.entrySet()) {
			lineItemList.add(element.getValue());
		}
		return lineItemList;
	}

	public double getCheckoutPrice() {
		checkoutPrice = 0;
		for (int i = 0; i < lineItemList.size(); i++)
			checkoutPrice += lineItemList.get(i).getTotal();
		return checkoutPrice;
	}

	public void deleteLineItem(String deleteItem) {
		if (lineItemMap.containsKey(deleteItem))
			lineItemMap.remove(deleteItem);
	}
}