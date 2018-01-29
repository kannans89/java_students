package com.techlabs.test;

import com.techlabs.classes.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCardFactory abstractFactory= CreditCardFactory.getCreditCardFactory(1000);
		System.out.println(abstractFactory.getClass());
		CreditCard card=abstractFactory.getCreditCard(CreditCardType.PLATINUM);
		System.out.println(card.getClass());
		card.setCard_no(6576);
		card.setCvv_no(868);
		IValidator validator=abstractFactory.getValidator(CreditCardType.PLATINUM);
		System.out.println(validator.getClass());
		if(validator.validate(card))
		{
			System.out.println("CArd validate");
		}
		else
		{
			System.out.println("Card not valid");
		}
		

	}

}
