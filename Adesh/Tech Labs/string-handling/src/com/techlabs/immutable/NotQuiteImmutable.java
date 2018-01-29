package com.techlabs.immutable;

public class NotQuiteImmutable {
	private int[] noArray;

	public NotQuiteImmutable(int[] noArray) {
		this.noArray = noArray;
	}

	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		for (int x : noArray) {
			returnString.append(x + " ");
		}
		return "noArray = " + returnString;
	}

}
