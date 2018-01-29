package AccountTest;

import account.*;

public class AccountTest {

	public static void main(String[] args) {
		Account[] acc = new Account[3];
		acc[0] = new Account(10001111, "Pratibha", 10000, AccountType.SAVING);
		acc[1] = new Account(11110000, "XYZ", 5000, AccountType.CURRENT);
		acc[2] = new Account(12121212, "Shweta");
		AccountTest.print(acc);
		acc[0].deposite(10000);
		AccountTest.printInfo(acc[0]);
		try {
			acc[1].withdraw(10000);
		} catch (NegativeBalanceException e) {
			e.printStackTrace();
		}
		AccountTest.printInfo(acc[1]);

		

	}

	public static void printInfo(Account acc) {
		System.out.println();
		System.out.println("name=" + acc.getName());
		System.out.println("Account Number=" + acc.getAccountNo());
		System.out.println("Balance=" + acc.getBalance());
		System.out.println("Account Type=" + acc.getAccountType());
	}

	public static void print(Account[] acc) {
		for (Account a : acc)
			printInfo(a);
	}
}
