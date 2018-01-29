package techlab.com.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	@SuppressWarnings("rawtypes")
	private List guitars;

	@SuppressWarnings("rawtypes")
	public Inventory() {
		guitars = new LinkedList();
	}

	@SuppressWarnings("unchecked")
	public void addGuitar(String serialNumber, double price, Builder builder, 
			String model, Type type,int numString, Wood backWood,
			Wood topWood) {
		GuitarSpec spec=new GuitarSpec(builder, model, type,numString, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price,spec);
		guitars.add(guitar);
	}

	@SuppressWarnings("rawtypes")
	public Guitar getGuitat(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(GuitarSpec whatErinLikes) {
		List matchingGuitars = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			
			if(guitar.getguitarSpec().matches(whatErinLikes))
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

}
