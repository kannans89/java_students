package com.techlabs.service;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

public class ShopingCartService {

	Map<String, Product> prod = new HashMap<String, Product>();

	public ShopingCartService() {
		prod.put("1111", new Product("Mobile", "1111", 10000));
		prod.put("1112", new Product("Laptop", "1112", 50000));
		prod.put("1113", new Product("Head Phone", "1113", 1000));
		prod.put("1114", new Product("Earphone", "1114", 250));
		prod.put("1115", new Product("Washing Machine", "1115", 8999));
		prod.put("1116", new Product("Refrigerator", "1116", 16000));
		prod.put("1117", new Product("AC", "1117", 9999));

	}

	public Map<String, Product> getProducts() {
		return prod;
	}

}