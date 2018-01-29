package com.techlabs.immutable;

public class NotQuiteMutable {
	private int[] numberArray;

	public NotQuiteMutable(int[] numberArray) {
		this.numberArray = numberArray;
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
