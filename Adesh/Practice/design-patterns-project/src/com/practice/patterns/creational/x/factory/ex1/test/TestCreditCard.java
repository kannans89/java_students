package com.practice.patterns.creational.x.factory.ex1.test;

import com.practice.patterns.creational.x.factory.ex1.CardType;
import com.practice.patterns.creational.x.factory.ex1.CreditCard;
import com.practice.patterns.creational.x.factory.ex1.CreditCardFactory;
import com.practice.patterns.creational.x.factory.ex1.IValidator;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(100);
		System.out.println(factory.getClass());
		
		CreditCard card = factory.getCreditCard(CardType.GOLD);
		card.setCardLength(5);
		card.setCvvNumber(12345);
		
		IValidator validator = factory.getValidtor(CardType.GOLD);
		System.out.println(validator.getClass());
		
		if(validator.isValid(card)){
			System.out.println("\nGold card validated");
		}else if(validator.isValid(card)){
			System.out.println("\nCard validation is failed.. \nplease try again..");
		}
	}

}
