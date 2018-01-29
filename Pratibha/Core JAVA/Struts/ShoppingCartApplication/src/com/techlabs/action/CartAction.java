package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Order;

@SuppressWarnings({ })
public class CartAction implements Action, ModelDriven<CartViewModel>,
		SessionAware {
	private Map<String, Object> session;
	private CartViewModel model;

	public CartAction() {
		System.out.println("test");

	}

	@Override
	public String execute() throws Exception {
		System.out.println(model.ss.getProducts());
		model.prod = model.ss.getProducts();
		System.out.println(model.prod.size());
		model.order = (Order) session.get("model.order");
		System.out.println(model.order);
		if (model.order == null) {
			model.order = new Order();
			session.put("model.order", model.order);
		}

		if (model.firstcall)
			System.out.println("get");
		String actionName = ActionContext.getContext().getName();
		System.out.println("url" + actionName);
		if (actionName.equals("add")) {
			model.order = (Order) session.get("model.order");
			model.lineitem.setProduct(model.prod1);
			model.lineitem.getProduct().setPrice(
					model.prod.get(model.lineitem.getId()).getPrice());
			model.lineitem.setCost(model.prod1.getPrice()
					* model.lineitem.getQuantity());
			model.lineitem.getProduct().setName(
					model.prod.get(model.lineitem.getId()).getName());
			model.order.addToCart(model.lineitem);
		}
		if (actionName.equals("Checkout")) {
			System.out.println(model.order.chechOutCost());
			model.checkout = "Rs." + model.order.chechOutCost();
		}
		model.setItem(model.order.getItem());
		return SUCCESS;
	}

	@Override
	public CartViewModel getModel() {
		return model;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
