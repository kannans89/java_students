package com.techlabs.patterns.abstractfactory.test;

import com.techlabs.patterns.abstractfactory.cards.CreditCard;
import com.techlabs.patterns.abstractfactory.cards.CreditCardType;
import com.techlabs.patterns.abstractfactory.cards.IValidator;
import com.techlabs.patterns.abstractfactory.cards.factory.CreditCardFactory;

public class CreditCardFactoryTest {

	public static void main(String[] args) {

		CreditCardFactory abstFactory = CreditCardFactory
				.getCreditCardFactory(500);
		System.out.println(abstFactory.getClass());

		CreditCard card = abstFactory.getCreditCard(CreditCardType.PLATINUM);
		System.out.println(card.getClass());

		IValidator validator = abstFactory
				.getValidator(CreditCardType.PLATINUM);
		System.out.println(validator.getClass());

		if (validator.validate(card))
			System.out.println("Card Validated Successfully");
		else
			System.out.println("Try Again");
	}

}
