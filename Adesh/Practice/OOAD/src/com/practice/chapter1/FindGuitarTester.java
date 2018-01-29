package com.practice.chapter1;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.COLLINGS,
				"charminar", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD, 6);

		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec Spec = guitar.getSpec();
				System.out.println("we have a " + Spec.getBuilder() + " "
						+ Spec.getModel() + " " + Spec.getType() + " Guitar:\n"
						+ Spec.getBackWood() + " back and sides\n"
						+ Spec.getNumStrings() + " Strings "
						+ Spec.getBackWood()
						+ " top.\nyou can have it only for rs."
						+ guitar.getPrice() + "!\n   ======================");
			}
		} else {
			System.out.println("sorry erin we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("v95693", 1499.87, new GuitarSpec(Builder.FENDER,
				"stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
		inventory.addGuitar("v9512", 1569.87, new GuitarSpec(Builder.FENDER,
				"stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
		inventory.addGuitar("L3456", 1347.97, new GuitarSpec(Builder.COLLINGS,
				"charminar", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD, 6));
		inventory.addGuitar("L3906", 1167.97, new GuitarSpec(Builder.COLLINGS,
				"charminar", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD, 6));
	}
}
