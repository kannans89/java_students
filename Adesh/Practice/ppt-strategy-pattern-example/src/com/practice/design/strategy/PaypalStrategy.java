package com.practice.design.strategy;

public class PaypalStrategy implements IPaymentStrategy{
	private String emailId;
	private String password;
	
	public PaypalStrategy(String emailId, String password){
		this.emailId = emailId;
		this.password = password;
	}

	public void pay(int amount) {
		System.out.println(amount+" paid using Paypal.");
	}
	
	public String getEmaiulId(){
		return emailId;
	}
	
	public String getPassword(){
		return password;
	}

}
