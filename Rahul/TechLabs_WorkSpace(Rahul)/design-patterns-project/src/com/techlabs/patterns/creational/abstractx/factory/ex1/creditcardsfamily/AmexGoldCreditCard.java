package com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily;

public class AmexGoldCreditCard extends CreditCardFamily {

	@Override
	public void setCreditCardNumber(int cardNumber) {
		creditCardNumber = cardNumber;		
	}

	@Override
	public void setCreditCardCVV(int cardCVV) {
		creditCardCVV = cardCVV;
	}

	@Override
	public int getCreditCardNumber() {
		// TODO Auto-generated method stub
		return creditCardNumber;
	}

	@Override
	public int getCreditCardCVV() {
		// TODO Auto-generated method stub
		return creditCardCVV;
	}

}
