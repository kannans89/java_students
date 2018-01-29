package com.techlabs.patterns.creational.abstractfactory.practice;

public class VisaGoldValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return true;
	}

}
