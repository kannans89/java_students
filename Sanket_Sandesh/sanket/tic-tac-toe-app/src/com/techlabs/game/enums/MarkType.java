package com.techlabs.game.enums;

public enum MarkType {
	X, O, $;

	public String toString() {
		switch (this) {
		case X:
			return "X";
		case O:
			return "O";
		case $:
			return " ";
		default:
			return "unspecified";

		}

	}
}
