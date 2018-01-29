package com.techlabs.immutable;

public class NotQuiteImmutable {

	// Instance Variables
	private int[] numberArray;

	// constructor

	public NotQuiteImmutable(int[] array) {
		numberArray = array;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		for (int currentElement : numberArray) {
			builder.append(currentElement);
			builder.append(" ");
		}

		return builder.toString();
	}
}
