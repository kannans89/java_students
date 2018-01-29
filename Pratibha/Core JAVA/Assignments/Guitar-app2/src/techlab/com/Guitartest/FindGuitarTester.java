package techlab.com.Guitartest;
import java.util.Iterator;
import java.util.List;

import techlab.com.guitar.Builder;
import techlab.com.guitar.Guitar;
import techlab.com.guitar.GuitarSpec;
import techlab.com.guitar.Inventory;
import techlab.com.guitar.Type;
import techlab.com.guitar.Wood;

public class FindGuitarTester {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initialiseInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,6, Wood.ALDER,
				Wood.ALDER);
		List matchingGuitars = (List) inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {

			System.out.println("Erin, you might like this guitars:\n");

			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getguitarSpec();
				System.out.println("we have a " + spec.getBuilder() + " " +spec.getNumString() + " " + spec.getModel() +
						"  " + spec.getType()+ " guitar:\n" + spec.getBackWood() + " back and sides,\n" + " " + spec.getTopWood()
						+ " top.\nYou can have it for only $" + guitar.getPrice() + "! ");
				System.out.println("___");
			}

		} else
			System.out.println("Sorry, Erin, we have nothing for you");

	}

	private static void initialiseInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocaster", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.00, Builder.FENDER, "Stratocaster", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);

	}

}
