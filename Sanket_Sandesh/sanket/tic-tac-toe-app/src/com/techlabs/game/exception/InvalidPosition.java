package com.techlabs.game.exception;

@SuppressWarnings("serial")
public class InvalidPosition extends RuntimeException {
	public InvalidPosition(String message) {
		super(message);
	}
}
