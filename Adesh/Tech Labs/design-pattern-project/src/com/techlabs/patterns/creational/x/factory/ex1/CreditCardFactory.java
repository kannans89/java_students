package com.techlabs.patterns.creational.x.factory.ex1;

public abstract class CreditCardFactory {
	private CardType type;
	
	public static CreditCardFactory getCreditCardFactory(int creditScore){
		if(creditScore > 1000){
			return new AmexCreditCardFactory();
		}else if(creditScore < 1000){
			return new VisaCreditCardFactory();
		}else return null;
		
	}
	
	public abstract CreditCard getCreditCard(CardType type);
	
	public abstract IValidator getValidator(CardType type);

	public CardType getType() {
		return type;
	}
}
