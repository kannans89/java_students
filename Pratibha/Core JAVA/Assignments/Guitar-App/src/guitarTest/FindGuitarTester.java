package guitarTest;

import java.util.*;

import guitar.*;

public class FindGuitarTester {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initialiseInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
				"Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List matchingGuitars = (List) inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {

			System.out.println("Erin, you might like this");

			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				if (guitar != null) {
					System.out.println("we have a " + guitar.getBuilder() + " "
							+ guitar.getModel() + "  " + guitar.getType()
							+ " guitar:\n" + guitar.getBackWood()
							+ "back and sides" + " " + guitar.getTopWood()
							+ "top.\nYou can have it for only $"
							+ guitar.getPrice() + "! ");
				} else
					System.out.println("Sorry, Erin, we have nothing for you");

			}
		}
	}

	private static void initialiseInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocaster",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.00, Builder.FENDER, "Stratocaster",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

	}

}
