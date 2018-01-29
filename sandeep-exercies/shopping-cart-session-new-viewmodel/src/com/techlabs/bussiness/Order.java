package com.techlabs.bussiness;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

public class Order {

	private List<LineItem> lineItems;

	public Order() {
		lineItems = new ArrayList<LineItem>();
		System.out.println("in Addservice-constructor");
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public void addToLineItems(int id, int quantity, Product product) {

		LineItem item = new LineItem();
		item.setQuantity(quantity);
		item.setProduct(product);

		for (LineItem lineItem : lineItems) {

			if (lineItem.getProduct().getProductId() == id) {
				System.out.println("alrady contaion");
				quantity += lineItem.getQuantity();
				lineItem.setQuantity(quantity);
				return;
			}
		}

		lineItems.add(item);

	}

	public void deleteItem(int id) {

		for (int i = 0; i < lineItems.size(); i++) {
			if (lineItems.get(i).getProduct().getProductId() == id) {
				lineItems.remove(i);
				break;
			}
		}
		System.out.println(id + " " + lineItems.size());
	}

	public int calculateCheckoutPrice() {

		int total = 0;
		for (LineItem lineItem : lineItems) {
			total += lineItem.getQuantity() * lineItem.getProduct().getPrice();
		}
		return total;

	}

}
