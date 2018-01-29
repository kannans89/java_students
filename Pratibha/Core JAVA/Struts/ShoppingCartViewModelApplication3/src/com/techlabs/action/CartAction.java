package com.techlabs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;
import com.techlabs.service.ShopingCartService;

@SuppressWarnings({})
public class CartAction implements Action, ModelDriven<CartVeiwModel>,
		SessionAware {
	private Map<String, Object> session;
	private CartVeiwModel model;
	private Order order;
	public CartAction() {
	}

	@Override
	public String execute() throws Exception {
		System.out.println(model.call);
		System.out.println(model.getDeleteId());
		System.out.println(model.getCheckout());
		ShopingCartService service = new ShopingCartService();
		System.out.println(service.getProducts());
		Map<String, Product> prodlist = new HashMap<String, Product>();
		prodlist = service.getProducts();
		System.out.println(prodlist);
		model.setProdlist(prodlist);
		model.setList(new ArrayList<Product>(model.getProdlist().values()));

		order=(Order) session.get("order");
		if (order == null) {
			order=(new Order());
			session.put("order", order);
		}

				
		if (model.call.equals("post")) {
			order=((Order) session.get("order"));
			model.getLineitem().setProduct(model.getProd());
			System.out.println("q" + model.getLineitem().getQuantity() + "list"
					+ model.getProd().getId());
			model.getLineitem().setId(model.getProd().getId());
			model.getLineitem()
					.getProduct()
					.setPrice(
							model.getProdlist().get(model.getProd().getId())
									.getPrice());
			model.getLineitem().setCost(
					model.getProd().getPrice()
							* model.getLineitem().getQuantity());
			model.getLineitem()
					.getProduct()
					.setName(
							model.getProdlist().get(model.getProd().getId())
									.getName());
			order.addToCart(model.getLineitem());
		}
		if (model.getCheckout().equals("true")) {
			model.setCheckout("Rs." + order.chechOutCost());
		}
		else
			model.setCheckout("");
		if(model.getDeleteId()!=0){
		System.out.println("Deleted Item");
		order.deleteItem(model.getDeleteId());
		}
		model.setItem(order.getItem());
		return SUCCESS;

	}

	@Override
	public CartVeiwModel getModel() {
		model = new CartVeiwModel();
		return model;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
