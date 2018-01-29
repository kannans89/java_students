package com.techlabs.classes;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(double score)
	{
		CreditCardFactory factory=null;
		if(score>=1000)
		{
			factory=new VisaCardFactory();
		}
		else 
		{
			factory=new  AmexCreditCardFactory();
		}
		
		return factory;
	}
	
	
	public abstract CreditCard getCreditCard(CreditCardType type);
	public abstract IValidator getValidator(CreditCardType type);

}
