package com.techlabs.controllers.services;

public class NoUserFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "No user found with this username";
	}
}
