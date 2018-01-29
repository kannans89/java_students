package com.techlabs.patterns.abstractfactory.cards;

public class AmexPlatinumValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
