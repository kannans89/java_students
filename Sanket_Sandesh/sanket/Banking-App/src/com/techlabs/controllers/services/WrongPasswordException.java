package com.techlabs.controllers.services;

public class WrongPasswordException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Password does not match";
	}
}
