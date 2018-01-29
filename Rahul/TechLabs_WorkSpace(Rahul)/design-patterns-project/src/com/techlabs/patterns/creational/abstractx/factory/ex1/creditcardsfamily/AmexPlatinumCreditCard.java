package com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily;

public class AmexPlatinumCreditCard extends CreditCardFamily{

	@Override
	public void setCreditCardNumber(int cardNumber) {
		creditCardNumber = cardNumber;
	}

	@Override
	public void setCreditCardCVV(int cardCVV) {
		creditCardCVV = cardCVV;
	}
	
	public int getCreditCardNumber(){
		return creditCardNumber;
	}
	public int getCreditCardCVV(){
		return creditCardCVV;
	}

}
