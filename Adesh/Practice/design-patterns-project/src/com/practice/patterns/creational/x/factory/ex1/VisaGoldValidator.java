package com.practice.patterns.creational.x.factory.ex1;

public class VisaGoldValidator implements IValidator{

	public boolean isValid(CreditCard type) {
		return type.cardLength > 0;
	}

}
