package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import com.techlabs.model.Product;

public class ProductService {

	private static List<Product> productList;
	private List<String> products;

	public ProductService() {
		setProducts(new ArrayList<String>());
		System.out.println("in ProductService-contructor");
	}

	static {
		System.out.println("in ProductService-static block");
		productList = new ArrayList<Product>();
		productList.add(new Product(101, "sony", 20000));
		productList.add(new Product(102, "samsung", 14000));
		productList.add(new Product(103, "micro", 10000));
		productList.add(new Product(104, "vivo", 15000));

	}

	public List<Product> getProductList() {
		System.out.println("in ProductService-getProductList");
		return productList;
	}

	public Product getProductById(int productId) {
		for (Product product : productList) {
			if (product.getProductId() == productId) {
				return product;
			}
		}

		return null;

	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

}
