package com.techlabs.model;

public class Product {
private String name;
private String id;
private int price;
private int quantity;
private int totalprice;

public Product(){
	
}
public Product(String name,String id,int price){
	setName(name);
	setId(id);
	setPrice(price);
}

public Product(String name, String id, int price, int quantity, int totalprice) {
	setName(name);
	setId(id);
	setPrice(price);
	setQuantity(quantity);
	setTotalprice(totalprice);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotalprice() {
	return totalprice;
}
public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}
}
