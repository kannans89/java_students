package com.techlabs.patterns.creational.abstractx.factory.ex1.test;

import com.techlabs.patterns.creational.abstractx.factory.ex1.CardType;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.IValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;
import com.techlabs.patterns.creational.abstractx.factory.ex1.factory.CreditCardFactory;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCardFactory factory = CreditCardFactory
				.getCreditCardFactory(99999);
		System.out.println(factory.getClass().getName());
		CreditCardFamily card = factory.getCreditCard(CardType.GOLD);
		card.setCreditCardNumber(1000000000);
		card.setCreditCardCVV(123);
		IValidator validator = factory.getValidator(CardType.GOLD);
		System.out.println(validator.getClass().getName());
		if (validator.isValid(card)) {
			System.out.println("Gold Credit card Valid");
		} else
			System.out.println("Card Invalid");
	}
}
