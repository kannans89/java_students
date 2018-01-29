package com.techlabs.evenoddcheck;

import java.util.ArrayList;

public class EvenOddCheck {
	ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();
	ArrayList<Integer> oddNumbersList = new ArrayList<Integer>();

	public void checkEvenOdd(int numberToCheck) {
		if ((numberToCheck % 2) == 0) {
			evenNumbersList.add(numberToCheck);
		} else {
			oddNumbersList.add(numberToCheck);
		}

	}

	public ArrayList<Integer> getevenNumbersList() {
		return evenNumbersList;
	}

	public ArrayList<Integer> getoddNumbersList() {
		return oddNumbersList;
	}

}
