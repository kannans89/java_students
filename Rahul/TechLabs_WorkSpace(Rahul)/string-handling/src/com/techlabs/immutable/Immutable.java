package com.techlabs.immutable;

public final class Immutable {
	// Instance Variable
	private final int[] numberArray;

	// constructor
	public Immutable(int[] array) {
		numberArray = array.clone(); // we have cloned the array copy which have
										// been passed as an argument
										// to constructor of Immutable so now
										// array.clone() will give a object with
										// different address but is duplicate
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
