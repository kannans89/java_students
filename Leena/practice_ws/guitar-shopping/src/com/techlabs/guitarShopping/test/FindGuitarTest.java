package com.techlabs.guitarShopping.test;

import java.util.Iterator;
import java.util.List;
import com.techlabs.guitarShopping.Guitar;
import com.techlabs.guitarShopping.Inventory;
import com.techlabs.guitarShopping.enumration.Builder;
import com.techlabs.guitarShopping.enumration.Type;
import com.techlabs.guitarShopping.enumration.Wood;

public class FindGuitarTest {

	public static void main(String[] args) {
		
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes=new Guitar("", 0,Builder.FENDER, "Stratocastor",Type.ACOUSTIC,Wood
				.ALDER,Wood.ALDER);
		List matchingGuitars=inventory.search(whatErinLikes);
		//Guitar guitar=inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()){
			
		//if(guitar!=null){
			System.out.println("Erin you might have like this guitars");
			for(Iterator i=matchingGuitars.iterator();i.hasNext();){
				Guitar guitar=(Guitar)i.next();
				System.out.println(" We have a "+guitar.getBuilder()+" "+guitar.getModel()+" "+
				guitar.getType()+" guitar :\n "+guitar.getBackWood()+ " back and sides ,\n "+
						guitar.getTopWood()+" top.\n You can have it for only $"+guitar.getPrice());
			
				System.out.println("================================================");
			}
			
		}
		else{
			System.out.println("Sorry,Erin,we have nothing for you..");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("101",50000,Builder.FENDER, "Stratocastor",Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("102",70000,Builder.FENDER, "Stratocastor",Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		
	
	
	}
	

}
