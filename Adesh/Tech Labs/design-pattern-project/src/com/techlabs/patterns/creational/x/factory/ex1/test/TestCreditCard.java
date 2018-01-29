package com.techlabs.patterns.creational.x.factory.ex1.test;

import com.techlabs.patterns.creational.x.factory.ex1.CardType;
import com.techlabs.patterns.creational.x.factory.ex1.CreditCard;
import com.techlabs.patterns.creational.x.factory.ex1.CreditCardFactory;
import com.techlabs.patterns.creational.x.factory.ex1.IValidator;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(100);
		System.out.println(factory.getClass());
		
		CreditCard card = factory.getCreditCard(CardType.GOLD);
		card.setCardLength(6);
		card.setCvvNumber(5555);
		
		IValidator validator = factory.getValidator(CardType.GOLD);
		System.out.println(validator.getClass().getName());
		
		if(validator.isValid(card)){
			System.out.println("\nGold card validated");
		}else{
			System.out.println("\nCard validation is failed.. \n   please try again..!");
		}
	}

}
