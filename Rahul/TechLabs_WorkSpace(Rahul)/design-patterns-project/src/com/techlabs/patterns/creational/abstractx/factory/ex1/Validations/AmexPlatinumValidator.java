package com.techlabs.patterns.creational.abstractx.factory.ex1.Validations;

import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;

public class AmexPlatinumValidator implements IValidator{

	@Override
	public boolean isValid(CreditCardFamily card) {
		String cardNumber =  new Integer(card.getCreditCardNumber()).toString();
		return (cardNumber.length() >8 && cardNumber.length()<11);
	}

}
