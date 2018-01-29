package com.techlab.account;

@SuppressWarnings("serial")
public class InsufficientFundException extends Exception{
	private String msg;
	public InsufficientFundException(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage(){
		return("ICICI Manager "+msg);
	}
}
