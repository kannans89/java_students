package com.swabhav.stack;

public class StackEmptyException extends RuntimeException {
	public  StackEmptyException(SwabhavStack swabhavStack) {
	}
	@Override
	public String getMessage()
	{
		return "Stack is Empty..!!";
	}



}
