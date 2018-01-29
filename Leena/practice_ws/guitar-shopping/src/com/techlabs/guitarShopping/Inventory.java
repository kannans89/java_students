package com.techlabs.guitarShopping;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitarShopping.encapsulation.GuitarSpec;
import com.techlabs.guitarShopping.enumration.Builder;
import com.techlabs.guitarShopping.enumration.Type;
import com.techlabs.guitarShopping.enumration.Wood;

public class Inventory {
	
	public List guitars;
	private GuitarSpec spec=new GuitarSpec(Builder.FENDER, "Stylish Model ", Type.ACOUSTIC, 100, Wood.ALDER, Wood.ALDER);
	
	
	public Inventory(){
		guitars=new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price, GuitarSpec spec){
		Guitar guitar=new Guitar(serialNumber,price,spec);
		guitars.add(guitar);
	}
	
	/*public void addGuitar(String serialNumber,double price,GuitarSpec spec){
		Guitar guitar=new Guitar(serialNumber,price,spec);
		guitars.add(guitar);
	}
*/	
	
	
	public Guitar getGuitar(String serialNumber){
		for(Iterator index=guitars.iterator(); index.hasNext();){
			Guitar guitar=(Guitar)index.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec whatErinLikes) {
		List matchingGuitars=new LinkedList();
		for(Iterator i=guitars.iterator();i.hasNext();){
			Guitar guitar=(Guitar)i.next();
			
			if(guitar.getSpec().matches(whatErinLikes))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	
	
	
		
		//return matchingGuitars;
		//return null;
	}


