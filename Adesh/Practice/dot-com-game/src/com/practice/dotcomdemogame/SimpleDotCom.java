package com.practice.dotcomdemogame;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public String checkYourself(String stringGuess) {
		String result = "miss";
		int guess = Integer.parseInt(stringGuess);
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			return result = "kill";

		}
		System.out.println(result);
		return result;
	}

	public void setLocationCells(int[] cellLocations) {
		locationCells = cellLocations;
	}

}
