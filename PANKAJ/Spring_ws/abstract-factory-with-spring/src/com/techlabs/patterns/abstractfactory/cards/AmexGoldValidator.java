package com.techlabs.patterns.abstractfactory.cards;

public class AmexGoldValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
