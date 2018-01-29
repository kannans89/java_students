package com.techlabs.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class CartVeiwModel {
	public String call = "get";
	private LineItem lineitem;
	private Map<String, LineItem> item;
	private Product prod;
	private Map<String, Product> prodlist;
	private String checkout;
	private List<Product> list;
	private int deleteId;

	public CartVeiwModel() {
		prod=new Product();
		prodlist = new HashMap<String, Product>();
		lineitem = new LineItem();
		checkout="false";
		System.out.println(prodlist);
	}

	public LineItem getLineitem() {
		return lineitem;
	}

	public void setLineitem(LineItem lineitem) {
		this.lineitem = lineitem;
	}

	public Map<String, LineItem> getItem() {
		return item;
	}

	public void setItem(Map<String, LineItem> item) {
		this.item = item;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod1) {
		this.prod = prod1;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public Map<String, Product> getProdlist() {
		return prodlist;
	}

	public void setProdlist(Map<String, Product> prodlist) {
		this.prodlist = prodlist;
	}

	public int getDeleteId() {
		return deleteId;
	}

	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}

	public String getCall() {
		return call;
	}
	
	public void setCall(String call) {
		this.call = call;
	}
}

