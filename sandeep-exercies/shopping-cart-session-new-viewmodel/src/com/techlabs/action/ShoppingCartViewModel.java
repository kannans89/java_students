package com.techlabs.action;

import java.util.List;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;
import com.techlabs.service.ProductService;

public class ShoppingCartViewModel {
	
	private int quantity;
	private int checkOutPrice;
	private int productId;
	private int deleteId;

	private boolean addOperation = false;
	private boolean checkOutOperation = false;
	private boolean deleteOpration = false;
	
	private List<Product> productList;
	private List<LineItem> lineItems;
	
	public ShoppingCartViewModel() {
		setProductList(new ProductService().getProductList()); 
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCheckOutPrice() {
		return checkOutPrice;
	}
	public void setCheckOutPrice(int checkOutPrice) {
		this.checkOutPrice = checkOutPrice;
	}

	public int getDeleteId() {
		return deleteId;
	}
	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
		deleteOpration=true;
	}
	public boolean isAddOperation() {
		return addOperation;
	}
	public void setAddOperation(boolean addOperation) {
		this.addOperation = addOperation;
	}
	public boolean isCheckOutOperation() {
		return checkOutOperation;
	}
	public void setCheckOutOperation(boolean checkOutOperation) {
		this.checkOutOperation = checkOutOperation;
	}
	public boolean isDeleteOpration() {
		return deleteOpration;
	}
	public void setDeleteOpration(boolean deleteOpration) {
		this.deleteOpration = deleteOpration;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "ShoppingCartViewModel [quantity=" + quantity + ", checkOutPrice=" + checkOutPrice + ", productId="
				+ productId + ", deleteId=" + deleteId + ", addOperation=" + addOperation + ", checkOutOperation="
				+ checkOutOperation + ", deleteOpration=" + deleteOpration + ", productList="
				+ (productList != null ? productList.subList(0, Math.min(productList.size(), maxLen)) : null)
				+ ", lineItems=" + (lineItems != null ? lineItems.subList(0, Math.min(lineItems.size(), maxLen)) : null)
				+ "]";
	}
	
	
	
	
	
	

	

}
