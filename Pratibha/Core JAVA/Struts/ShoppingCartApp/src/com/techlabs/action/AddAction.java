package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Product;
import com.techlabs.service.LineItemService;

public class AddAction extends ActionSupport implements ModelDriven {
	private boolean isfirstcall = true;
	Product product = new Product();
	LineItemService lis;
	Map<String, Product> lineitems;
	Map<String, Product> prod;
	List<Product> list;
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	
	public Map<String, Product> getProd() {
		return prod;
	}

	public void setProd(Map<String, Product> prod) {
		this.prod = prod;
	}

	private String checkout;

	public Map<String, Product> getLineitems() {
		return lineitems;
	}

	public void setLineitems(Map<String, Product> lineitems) {
		this.lineitems = lineitems;
	}

	public AddAction() {
	}

	public String execute() throws Exception {
		lis = new LineItemService();
		String actionName = ActionContext.getContext().getName();
		System.out.println("url" + actionName);
		if (actionName.equals("Checkout")) {
			int total = lis.checkout();
			checkout = "Bill Amount: Rs." + total;
			System.out.println("test" + checkout);
		}
		if (actionName.equals("add")) {
			lis.addToCart(product.getName(), product.getQuantity());
			lis.display();
		}

		System.out.println(checkout);
		lineitems = LineItemService.getLineitems();
		prod=LineItemService.getProducts();
		 list = new ArrayList<Product>(prod.values());
		System.out.println("lineitem:" + lineitems);

		return SUCCESS;

	}

	public Object getModel() {
		return product;
	}

	public boolean isIsfirstcall() {
		return isfirstcall;
	}

	public void setIsfirstcall(boolean isfirstcall) {
		this.isfirstcall = isfirstcall;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}