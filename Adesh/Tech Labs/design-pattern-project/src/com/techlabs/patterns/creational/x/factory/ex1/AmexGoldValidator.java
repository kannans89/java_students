package com.techlabs.patterns.creational.x.factory.ex1;

class AmexGoldValidator implements IValidator{

	public boolean isValid(CreditCard type) {
		return type.cardLength > 0;
	}

}
