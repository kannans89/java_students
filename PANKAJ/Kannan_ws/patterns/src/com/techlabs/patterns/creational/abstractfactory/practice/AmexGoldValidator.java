package com.techlabs.patterns.creational.abstractfactory.practice;

public class AmexGoldValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
