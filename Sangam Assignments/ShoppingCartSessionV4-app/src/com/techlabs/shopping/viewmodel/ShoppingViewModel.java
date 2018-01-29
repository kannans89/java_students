package com.techlabs.shopping.viewmodel;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.shopping.model.LineItem;
import com.techlabs.shopping.service.ShoppingService;

public class ShoppingViewModel {
	private boolean addOperation = false;
	private boolean deleteOperation = false;
	private String deleteItem;
	private String productName;
	private int quantity;
	private double checkOutPrice = 0;
	private List<String> optionList;
	private ShoppingService service;
	private List<LineItem> productList;

	public ShoppingViewModel() {
		service = new ShoppingService();
		optionList = new ArrayList<String>(service.getOptionList().keySet());
	}

	public String getDeleteItem() {
		return deleteItem;
	}

	public void setDeleteItem(String deleteItem) {
		System.out.println("delete=" + deleteItem);
		this.deleteItem = deleteItem;
		deleteOperation = true;
	}

	public boolean isDeleteOperation() {
		return deleteOperation;
	}

	public void setDeleteOperation(boolean deleteOperation) {
		this.deleteOperation = deleteOperation;
	}

	public boolean isAddOperation() {
		return addOperation;
	}

	public void setAddOperation(boolean addOperation) {
		this.addOperation = addOperation;
	}

	public void setCheckOutPrice(double checkOutPrice) {
		this.checkOutPrice = checkOutPrice;
	}

	public void setProductList(List<LineItem> productList) {
		this.productList = productList;
	}

	public double getCheckOutPrice() {
		return checkOutPrice;
	}

	public List<LineItem> getProductList() {
		return productList;
	}

	public List<String> getOptionList() {
		return optionList;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}