package com.techlabs.beer;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrand(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
}
