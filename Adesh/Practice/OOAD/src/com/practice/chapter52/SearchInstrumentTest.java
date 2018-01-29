package com.practice.chapter52;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.practice.chapter1.Builder;
import com.practice.chapter1.Type;
import com.practice.chapter1.Wood;

public class SearchInstrumentTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.MARTIN);
		properties.put("backWood", Wood.CEDAR);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("You might like these Instrument:");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("we have a "
						+ spec.getProperty("instrumentType")
						+ " with the following properties");
				for (Iterator j = spec.getProperties().keySet().iterator(); j
						.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("  " + propertyName + ": "
							+ spec.getProperty(propertyName));
				}
				System.out.println("you can have this"
						+ spec.getProperty("instrumentType") + " for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("sorry erin we have nothing for you.");
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrument("11252", 2345.55,
				new InstrumentSpec(properties));
		
		properties.put("builder", Builder.MARTIN);
		properties.put("model", "D-18");
		properties.put("type", Type.ELECTRIC);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.CEDAR);
		properties.put("backWood", Wood.CEDAR);
		inventory.addInstrument("v34552", 3455.55,
				new InstrumentSpec(properties));
		inventory.addInstrument("v34595", 3995,
				new InstrumentSpec(properties));
		
		properties.put("instrumentType", InstrumentType.MANDOLIN);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "FG");
		properties.put("type", Type.ELECTRIC);
		properties.put("topWood", Wood.COCOBOLO);
		properties.put("backWood", Wood.COCOBOLO);
		inventory.addInstrument("S2345", 5671.47,
				new InstrumentSpec(properties));
		
		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "Qw");
		properties.put("type", Type.ACOUSTIC);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backWood", Wood.MAPLE);
		inventory.addInstrument("A2295", 9876.47,
				new InstrumentSpec(properties));

	}
}
