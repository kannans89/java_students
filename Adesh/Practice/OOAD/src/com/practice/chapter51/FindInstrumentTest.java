package com.practice.chapter51;

import java.util.Iterator;
import java.util.List;

import com.practice.chapter1.Builder;
import com.practice.chapter1.Type;
import com.practice.chapter1.Wood;

public class FindInstrumentTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		/*
		 * GuitarSpec whatErinLikes = new GuitarSpec(Builder.COLLINGS,
		 * "charminar", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
		 * Wood.BRAZILIAN_ROSEWOOD, 6);
		 */
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
				"stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

		List matchingInstruments = inventory.search(whatErinLikes);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("Erin, you might like these Instrument:");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec Spec = instrument.getSpec();
				System.out.println("we have a " + Spec.getBuilder() + " "
						+ Spec.getModel() + " " + Spec.getType() + " Guitar:\n"
						+ Spec.getBackWood() + " back and sides\n"
						+ Spec.getBackWood()
						+ " top.\nyou can have it only for rs."
						+ instrument.getPrice()
						+ "!\n   ======================");
			}
		} else {
			System.out.println("sorry erin we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addInstrument("v95693", 1499.87, new GuitarSpec(
				Builder.FENDER, "stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER, 12));
		inventory.addInstrument("v9512", 1569.87, new MandolinSpec(
				Builder.FENDER, "stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER, Style.A));
		inventory.addInstrument("L3456", 1347.97, new GuitarSpec(
				Builder.COLLINGS, "charminar", Type.ACOUSTIC,
				Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 6));
		inventory.addInstrument("L3906", 1167.97, new GuitarSpec(
				Builder.COLLINGS, "charminar", Type.ACOUSTIC,
				Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 6));
	}

}
