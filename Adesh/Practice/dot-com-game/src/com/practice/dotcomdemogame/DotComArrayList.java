package com.practice.dotcomdemogame;

import java.util.ArrayList;

public class DotComArrayList {
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public String checkYourself(String userInput) {
		String result = "miss";

		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				return result = "kill";
			} else {
				return result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}

}
