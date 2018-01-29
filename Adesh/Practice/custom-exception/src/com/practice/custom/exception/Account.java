package com.practice.custom.exception;

public class Account {
	private int accNo;
	private String accName;
	private double bal;
	
	public Account(int accNo, String accName, double bal){
		this.accNo=accNo;
		this.accName=accName;
		this.bal=bal;
	}
	
	public int getAccNo(){
		return this.accNo;
	}
	
	public String getAccName(){
		return this.accName;
	}
	
	public double getBal(){
		return this.bal;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException{
		if(bal-amount>500){
		return bal=bal+amount;
		}else{
			//throw new Exception("no funds transfer bcoz of low amount");
			throw new InsufficientFundsException(this, amount);
		}
	}

}
