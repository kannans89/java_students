package com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily;

public class VisaGoldCreditCard extends CreditCardFamily{

	@Override
	public void setCreditCardNumber(int cardNumber) {
		// TODO Auto-generated method stub
		creditCardNumber = cardNumber;
	}

	@Override
	public void setCreditCardCVV(int cardCVV) {
		// TODO Auto-generated method stub
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
