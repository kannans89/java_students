package com.techlabs.store;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.laptop.Brand;
import com.techlabs.laptop.HardDiskSize;
import com.techlabs.laptop.Laptop;
import com.techlabs.laptop.LaptopConfiguration;
import com.techlabs.laptop.Processor;
import com.techlabs.laptop.RamSize;
import com.techlabs.laptop.Size;

public class Store {

	private List<Laptop> LaptopsStock = new ArrayList<Laptop>();

	// Methods
	public void addLaptop(int serialNumber, String modelNumber, double price,
			Brand brand, RamSize ramSize, HardDiskSize hddSize,
			Processor processor, Size size) {
		
		Laptop laptop = new Laptop(serialNumber, modelNumber, price,
				new LaptopConfiguration(brand, ramSize, hddSize, processor,
						size));
		LaptopsStock.add(laptop);

	}
	
	public Laptop getLaptop(int serialNumber){
		for(Laptop currentLaptop : LaptopsStock ){
			if (currentLaptop.getlaptopSerialNumber() == serialNumber){
				return currentLaptop;
			}
		}
		return null;
		
	}
	
	public List<Laptop> searchLaptop(LaptopConfiguration requiredConfiguration){
		List<Laptop> matchingLaptop = new ArrayList<Laptop>();
		for(Laptop currentLaptop : LaptopsStock){
			LaptopConfiguration currentLaptopCofiguration = currentLaptop.getLaptopConfiguration();
			if(currentLaptopCofiguration.matches(requiredConfiguration)){
				matchingLaptop.add(currentLaptop);
			}
		}
		return matchingLaptop;
	}

}
