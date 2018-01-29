package com.techlabs.guitarShopping;
import com.techlabs.guitarShopping.encapsulation.GuitarSpec;
import com.techlabs.guitarShopping.enumration.Builder;
import com.techlabs.guitarShopping.enumration.Type;
import com.techlabs.guitarShopping.enumration.Wood;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec=new GuitarSpec(Builder.FENDER, "Stylish Model ", Type.ACOUSTIC, 100, Wood.ALDER, Wood.ALDER);
	
	
	public Guitar(String serialNumber, double price, GuitarSpec spec){
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	
	}

	public String getSerialNumber(){
		return serialNumber;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price=price;
	}
	
	public GuitarSpec getSpec(){
		return spec;
	}

	
}
