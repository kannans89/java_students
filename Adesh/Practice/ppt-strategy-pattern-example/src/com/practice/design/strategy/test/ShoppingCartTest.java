package com.practice.design.strategy.test;

import com.practice.design.strategy.CreditCardStrategy;
import com.practice.design.strategy.Item;
import com.practice.design.strategy.PaypalStrategy;
import com.practice.design.strategy.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("dropmehere@gmail.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("adesh", "1234590", "708", "15/25"));
	}

}
