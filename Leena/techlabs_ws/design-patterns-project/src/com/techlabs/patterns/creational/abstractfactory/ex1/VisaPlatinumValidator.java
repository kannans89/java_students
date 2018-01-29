package com.techlabs.patterns.creational.abstractfactory.ex1;

public class VisaPlatinumValidator implements IValidator{

	@Override
	public boolean isValid(CreditCard card){
		return card.cardNoLength>0;
	}
}
