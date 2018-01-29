package com.techlabs.shoping.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.shopping.model.Order;
import com.techlabs.shopping.model.Product;
import com.techlabs.shopping.service.ShoppingService;
import com.techlabs.shopping.viewmodel.ShoppingViewModel;

public class ShoppingAction implements Action, SessionAware,ModelDriven<ShoppingViewModel>{
	private ShoppingViewModel model;
	private Map<String,Object> session;
	@Override
	public String execute() throws Exception {
	
		if (model.isAddOperation()) 
		{
			Order order;
			Product product=new ShoppingService().getProduct(model.getProductName());
			if (session.containsKey("order")) {
				order = (Order) session.get("order");
				order.addToLineItem(product,model.getProductName(),model.getQuantity());
				
			} else {
				order=new Order();
				order.addToLineItem(product,model.getProductName(),model.getQuantity());
				session.put("order", order);
				model.setProductList(order.getLineItemToList());
				model.setCheckOutPrice(order.getCheckoutPrice());
			}
		}
		else if(model.isDeleteOperation())
		{
			Order order=(Order) session.get("order");
			order.deleteLineItem(model.getDeleteItem());
			model.setProductList(order.getLineItemToList());
			model.setCheckOutPrice(order.getCheckoutPrice());
		}
			return "success";
	} 
	@Override
	public void setSession(Map<String, Object> map) {
		session =  map;
	}
	@Override
	public ShoppingViewModel getModel() {
		model=new ShoppingViewModel();
		return model;
	}
}