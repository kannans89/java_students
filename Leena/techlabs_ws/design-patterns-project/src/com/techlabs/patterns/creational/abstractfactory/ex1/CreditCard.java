package com.techlabs.patterns.creational.abstractfactory.ex1;

public abstract class CreditCard {
	
	protected int cardNoLength;
	protected String cvvNumber;
	
	public void setCardLength(int no){
		this.cardNoLength=no;
	}
	
	public void setCvvNumber(String no){
		this.cvvNumber=no;
	}
	
	public abstract void getInformation(CreditCard card);
	

}
