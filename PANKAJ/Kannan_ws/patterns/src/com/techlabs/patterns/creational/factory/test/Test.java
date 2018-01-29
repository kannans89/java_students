package com.techlabs.patterns.creational.factory.test;

import com.techlabs.patterns.creational.factory.AccType;
import com.techlabs.patterns.creational.factory.Account;
import com.techlabs.patterns.creational.factory.AccountFactory;

public class Test {

	public static void main(String[] args) {

		Account pankaj = AccountFactory.getInstance().createAccount(10,
				"Pankaj", 50000, AccType.SA);
		Account kannan = AccountFactory.getInstance().createAccount(20,
				"Kannan", 60000, AccType.CA);
		
		System.out.println(pankaj);
		System.out.println(kannan);

	}

}
