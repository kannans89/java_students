package guitar;


import java.util.*;

public class Inventory {
	@SuppressWarnings("rawtypes")
	private List guitars;

	@SuppressWarnings("rawtypes")
	public Inventory() {
		guitars = new LinkedList();
	}

	@SuppressWarnings("unchecked")
	public void addGuitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type,
				backWood, topWood);
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
		List matchingGuitars=new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			Builder builder = whatErinLikes.getBuilder();
			if ((builder != null) && (!builder.equals(""))
					&& ((!builder.equals(guitar.getBuilder()))))
				continue;
			String model = whatErinLikes.getModel();
			if ((model != null) && (!model.equals(""))
					&& ((!model.equals(guitar.getModel()))))
				continue;
			Type type = whatErinLikes.getType();
			if ((type != null) && (!type.equals(""))
					&& ((!type.equals(guitar.getType()))))
				continue;
			Wood backWood = whatErinLikes.getBackWood();
			if ((backWood != null) && (!backWood.equals(""))
					&& ((!backWood.equals(guitar.getBackWood()))))
				continue;
			Wood topWood = whatErinLikes.getTopWood();
			if ((topWood != null) && (!topWood.equals(""))
					&& ((!topWood.equals(guitar.getTopWood()))))
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}


}
