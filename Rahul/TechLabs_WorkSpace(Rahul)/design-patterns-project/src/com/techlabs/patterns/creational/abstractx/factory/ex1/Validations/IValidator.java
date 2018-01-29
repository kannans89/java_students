package com.techlabs.patterns.creational.abstractx.factory.ex1.Validations;

import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;

public interface IValidator {
	public boolean isValid(CreditCardFamily card);

}
