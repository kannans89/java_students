package com.techlabs.laptop;

public class Laptop {
	// Instance Variables
	private int laptopSerialNumber;
	private String laptopModelNumber;
	private double laptopPrice;
	private LaptopConfiguration laptopConfig;
	
	//Constructors
	public Laptop(int serialNumber, String modelNumber, double price,
			LaptopConfiguration config) {
		laptopSerialNumber = serialNumber;
		laptopModelNumber = modelNumber;
		laptopPrice = price;
		laptopConfig = config;
	}
	//Methods
	public LaptopConfiguration getLaptopConfiguration(){
		return laptopConfig;
	}
	public int getlaptopSerialNumber(){
		return laptopSerialNumber;
	}
	public String getlaptopModelNumber(){
		return laptopModelNumber;
	}
	public double getlaptopPrice(){
		return laptopPrice;
	}

}
