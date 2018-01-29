package com.techlabs.patterns.abstractfactory.cards;

public class VisaGoldValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
