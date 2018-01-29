package com.techlabs.patterns.creational.x.factory.ex1;

class AmexPlatinumValidator implements IValidator{

	public boolean isValid(CreditCard type) {
		return type.cardLength > 0;
	}

}
