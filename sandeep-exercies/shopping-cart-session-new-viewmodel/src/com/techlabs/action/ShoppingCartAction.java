package com.techlabs.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.bussiness.Order;
import com.techlabs.model.Product;
import com.techlabs.service.ProductService;

public class ShoppingCartAction extends ActionSupport implements ModelDriven<ShoppingCartViewModel>, SessionAware {

	private static final long serialVersionUID = 1L;
	private ShoppingCartViewModel model;
	private Map<String, Object> session;

	public ShoppingCartAction() {
		System.out.println("in AddAction-constructor");
	}

	@Override
	public String execute() {

		System.out.println(model);

		if (model.isAddOperation()) {

			Product product = new ProductService().getProductById(model.getProductId());

			Order order = (Order) session.get("order");
			if (order == null) {
				System.out.println("first-time");
				Order firstOrder = new Order();
				firstOrder.addToLineItems(model.getProductId(), model.getQuantity(), product);
				session.put("order", firstOrder);
				model.setLineItems(firstOrder.getLineItems());
			} else {
				order.addToLineItems(model.getProductId(), model.getQuantity(), product);
				model.setLineItems(order.getLineItems());
			}

			System.out.println("---------------------------\n");
		}

		else if (model.isDeleteOpration()) {
			System.out.println("in delete ");
			Order order = (Order) session.get("order");
			order.deleteItem(model.getDeleteId());
			model.setLineItems(order.getLineItems());
		}

		else if (model.isCheckOutOperation()) {
			System.out.println("in checkout method");
			Order order = (Order) session.get("order");
			model.setCheckOutPrice(order.calculateCheckoutPrice());

		}

		return "success";

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public ShoppingCartViewModel getModel() {
		System.out.println("in AddAction-getModel");
		model = new ShoppingCartViewModel();
		return model;
	}

}
