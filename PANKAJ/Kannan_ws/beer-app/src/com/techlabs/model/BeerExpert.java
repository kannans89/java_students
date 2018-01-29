package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	List<String> beers;

	public BeerExpert() {
		beers = new ArrayList<String>();
	}

	public List<String> getAdvice(String color) {
		switch (color) {
		case "brown":
			beers.add("Brown beer 1");
			beers.add("Brown beer 2");
			break;
		case "green":
			beers.add("Green 1");
			beers.add("Green 2");
			break;
		}
		return beers;
	}

}
