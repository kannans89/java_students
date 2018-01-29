package com.techlabs.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.techlabs.model.Product;

public class LineItemService {

	static Map<String, Product> lineitems;
	static Map<String, Product> prod;
	static {
		lineitems = new HashMap<String, Product>();
		prod = new HashMap<String, Product>();
		prod.put("Mobile", new Product("Mobile", "1111", 10000));
		prod.put("Laptop", new Product("Laptop", "1112", 50000));
		prod.put("Head Phone", new Product("Head Phone", "1113", 1000));
		prod.put("Earphone", new Product("Earphone", "1114", 250));
		prod.put("Washing Machine",
				new Product("Washing Machine", "1115", 8999));
		prod.put("Refrigerator", new Product("Refrigerator", "1116", 16000));
		prod.put("AC", new Product("AC", "1117", 9999));

	}

	public static Map<String, Product> getLineitems() {
		return lineitems;
	}

	public static void setLineitems(Map<String, Product> line) {
		lineitems = line;
	}

	public void display() {
		System.out.println("lineitems" + lineitems.size());
		System.out.println("products" + prod.size());
	}

	public void addToCart(String key, int quantity) {
		if (lineitems.get(key) == null) {
			lineitems.put(key,
					new Product(prod.get(key).getName(), prod.get(key).getId(),
							prod.get(key).getPrice(), quantity, quantity
									* prod.get(key).getPrice()));
			System.out.println("absent");
		} else {
			System.out.println("present");
			lineitems.put(key,
					new Product(lineitems.get(key).getName(), lineitems.get(key).getId(),
							lineitems.get(key).getPrice(), lineitems.get(key)
									.getQuantity() + quantity, (lineitems.get(key)
									.getQuantity() + quantity)
									* lineitems.get(key).getPrice()));

		}
		for (Entry<String, Product> entry : lineitems.entrySet()) {
			System.out.println(entry.getKey() + "    "
					+ entry.getValue().getQuantity()+"   "+ entry.getValue().getTotalprice());
		}

	}
public int checkout(){
	int totalprice=0;
	for (Entry<String, Product> entry : lineitems.entrySet()) {
	totalprice=totalprice+entry.getValue().getTotalprice();	
	}
return totalprice;
}

public static Map<String, Product> getProducts() {
	
	return prod;
}
}
