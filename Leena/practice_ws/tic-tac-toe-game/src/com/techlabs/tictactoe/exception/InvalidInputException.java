package com.techlabs.tictactoe.exception;

public class InvalidInputException extends RuntimeException{
	
private String errorMessage;
	
	public InvalidInputException(String message) {
		errorMessage = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
