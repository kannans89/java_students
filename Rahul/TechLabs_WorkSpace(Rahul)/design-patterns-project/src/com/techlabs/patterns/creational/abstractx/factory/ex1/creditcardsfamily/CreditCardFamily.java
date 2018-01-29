package com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily;

public abstract class CreditCardFamily {
	protected int creditCardNumber;
	protected int creditCardCVV;
	
	public  abstract void setCreditCardNumber(int cardNumber);
	public  abstract void setCreditCardCVV(int cardCVV);
	public abstract int getCreditCardNumber();
	public abstract int getCreditCardCVV();

}
