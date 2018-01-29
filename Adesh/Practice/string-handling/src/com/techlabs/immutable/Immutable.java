package com.techlabs.immutable;

public class Immutable {
	private int[] numberArray;

	public Immutable(int[] numberArray) {
		this.numberArray = numberArray.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int number : numberArray) {
			builder.append(number + " ");
		}
		return "numberArray => " + builder;
	}
}
