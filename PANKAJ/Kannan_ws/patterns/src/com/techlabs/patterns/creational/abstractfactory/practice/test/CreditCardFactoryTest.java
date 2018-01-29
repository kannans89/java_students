package com.techlabs.patterns.creational.abstractfactory.practice.test;

import com.techlabs.patterns.creational.abstractfactory.practice.CreditCard;
import com.techlabs.patterns.creational.abstractfactory.practice.CreditCardFactory;
import com.techlabs.patterns.creational.abstractfactory.practice.CreditCardType;
import com.techlabs.patterns.creational.abstractfactory.practice.IValidator;

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
