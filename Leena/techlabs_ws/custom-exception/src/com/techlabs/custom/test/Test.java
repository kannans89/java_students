package com.techlabs.custom.test;
import com.techlabs.custom.Account;
import com.techlabs.custom.InsufficientFundsException;

public class Test {

	public static void main(String[] args) /* throws Exception */{

		Account acc1 = new Account(100, "Leena", 50);
		Account acc2 = new Account(100, "Sheetal", 5000);

		try {

			acc2.withdraw(200);
			System.out.println("======================================================");
			acc1.withdraw(2000);
		} // catch (InsufficientFundsException e)
		catch (Exception e) {
			// System.out.println("Exception Occurs..your balance is low");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thanks for Visiting");
			// }
		}

	}
}
