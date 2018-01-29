package com.techlabs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Order {
	private Map<String, LineItem> item;
	private double cost = 0;

	public Order() {

		setItem(new HashMap<String, LineItem>());
	}

	public void addToCart(LineItem lineItem) {
		if (item.get("" + lineItem.getId()) == null) {
			item.put("" + lineItem.getId(), lineItem);

		} else {
			lineItem.setQuantity(lineItem.getQuantity()
					+ item.get(lineItem.getId()).getQuantity());
			lineItem.setCost(lineItem.getProduct().getPrice()
					* lineItem.getQuantity());
			item.put(lineItem.getId(), lineItem);

		}

	}

	public double chechOutCost() {
		cost=0;
		for (Entry<String, LineItem> entry :item.entrySet()) {
			System.out.println(entry.getKey());
			cost=cost+entry.getValue().getCost();
		}

		return cost;
	}

	public Map<String, LineItem> getItem() {
		return item;
	}

	public void setItem(HashMap<String, LineItem> hashMap) {
		this.item = hashMap;
	}

	public void deleteItem(int deleteId) {
		this.item.remove(""+deleteId);
		
	}

}
