package com.techlabs.patterns.abstractfactory.cards;

public class VisaPlatinumValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
