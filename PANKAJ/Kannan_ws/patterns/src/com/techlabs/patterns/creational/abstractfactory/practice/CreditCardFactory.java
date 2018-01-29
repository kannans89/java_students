package com.techlabs.patterns.creational.abstractfactory.practice;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore){
		if(creditScore>=1000)
			return new AmexCreditCardFactory();
		else
			return new VisaCreditCardFactory();
		
	}
	
	public abstract CreditCard getCreditCard(CreditCardType type);
	public abstract IValidator getValidator(CreditCardType type);
}
