package com.techlabs.custom;

public class Account {

		private int id;
		private String name;
		protected double balance;

		public Account(int id, String name, double balance) {
			this.id = id;
			this.name = name;
			this.balance = balance;
		}

		public int getAccountNumber() {
			return id;
		}

		public String getCustomerName() {
			return name;
		}

		public double getBalance() {
			return balance;
		}
		
		public void deposite(double amount){
			
			this.balance+=amount;
		}
		
		public void withdraw(double amount) throws InsufficientFundsException{
			
			if((balance-amount)>500){
				balance=balance-amount;
				System.out.println(this.getCustomerName()+" Your money is deducted successfully...");
				System.out.println("Current balance is : "+balance+"$");
			}
			
			else
			{
				throw new InsufficientFundsException(this,amount);
			//new RunTimeException();
			}
		}
	}

	
	


