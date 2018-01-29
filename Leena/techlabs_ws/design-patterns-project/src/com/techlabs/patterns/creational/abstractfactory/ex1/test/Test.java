package com.techlabs.patterns.creational.abstractfactory.ex1.test;

import com.techlabs.patterns.creational.abstractfactory.ex1.CardType;
import com.techlabs.patterns.creational.abstractfactory.ex1.CreditCard;
import com.techlabs.patterns.creational.abstractfactory.ex1.CreditCardFactory;
import com.techlabs.patterns.creational.abstractfactory.ex1.IValidator;

public class Test {

	public static void main(String[] args) {
		
		CreditCardFactory factory=CreditCardFactory.getCreditCardFactory(500);
		System.out.println(factory.getClass().getName());
		
		CreditCard card=factory.getCreditCard(CardType.GOLD);
		card.setCardLength(6);
		card.setCvvNumber("S1245");
		
		IValidator validator=factory.getValidator(CardType.PLATINUM);
		System.out.println(validator.getClass().getName());
		System.out.println();
		if(validator.isValid(card)){
			System.out.println("Card Validation Successful");
			card.getInformation(card);
		}else{
			System.out.println("Card is Invalid");
		}
	}

}
