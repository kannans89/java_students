package com.practice.patterns.creational.x.factory.ex1;

public class AmexPlatinumValidator implements IValidator{

	public boolean isValid(CreditCard type) {
		return type.cardLength > 0;
	}

}
