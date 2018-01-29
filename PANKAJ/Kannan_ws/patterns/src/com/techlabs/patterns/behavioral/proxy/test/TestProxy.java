package com.techlabs.patterns.behavioral.proxy.test;

import com.techlabs.patterns.behavioral.proxy.AccountProxy;

public class TestProxy {

	public static void main(String[] args) {

		AccountProxy acc=new AccountProxy(10, 500);
		acc.deposit(1000);
		acc.withdraw(200);
	}

}
