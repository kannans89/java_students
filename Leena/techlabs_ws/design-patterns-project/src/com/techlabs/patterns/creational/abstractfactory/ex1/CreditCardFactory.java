package com.techlabs.patterns.creational.abstractfactory.ex1;

public abstract class CreditCardFactory {
	
	protected int creditScore;
	public static CreditCardFactory getCreditCardFactory(int score){
		if(score>1000){
			return new AmexCreditCardFactory();
		}
		return new VisaCreditCardFactory();
	}
	
	public abstract CreditCard getCreditCard(CardType type);
	
	public abstract IValidator getValidator(CardType type);
	
  }
