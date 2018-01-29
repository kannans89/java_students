package com.techlabs.shopping.service;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.shopping.model.Product;
public class ShoppingService {
	private static Map<String,Product> productMap=new HashMap<String,Product>();
	static{
		productMap.put("Samsung",new Product(1,"Samsung",15000));
		productMap.put("Nokia",new Product(2,"Nokia",10000));
		productMap.put("Iphone",new Product(3,"Iphone",50000));
		productMap.put("MI",new Product(4,"MI",13000));
		System.out.println("setting product");
	}
	public Map<String, Product> getOptionList()
	{	
		return productMap;
	}
	public Product getProduct(String productName)
	{
		if(productMap.containsKey(productName))
			return productMap.get(productName);
		else
			return null;
	}
}