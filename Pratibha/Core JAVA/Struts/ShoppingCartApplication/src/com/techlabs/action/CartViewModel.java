package com.techlabs.action;

import java.util.Map;

import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;
import com.techlabs.service.ShopingCartService;

public class CartViewModel {
	boolean firstcall = true;
	private Map<String, LineItem> item;
	Product prod1 = new Product();
	Map<String, Product> prod;
	@SuppressWarnings({}) String checkout;
	Order order;
	LineItem lineitem = new LineItem();
	ShopingCartService ss = new ShopingCartService();

	public boolean isFirstcall() {
		return firstcall;
	}

	public void setFirstcall(boolean firstcall) {
		this.firstcall = firstcall;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	
	public Map<String, LineItem> getItem() {
		return item;
	}

	public void setItem(Map<String, LineItem> item) {
		this.item = item;
	}

}
