package com.techlabs.immutable;

public final class Immutable {
	private final int[] noArray;

	public Immutable(int[] noArray) {
		this.noArray = noArray.clone();
	}

	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		for (int no : noArray) {
			returnString.append(no + " ");
		}
		return "noArray = " + returnString;
	}

}
