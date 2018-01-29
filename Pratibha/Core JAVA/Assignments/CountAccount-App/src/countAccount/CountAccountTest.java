package countAccount;

import account.Account;

public class CountAccountTest {
	private static int c = 0;
	private static int count;

	{
		count++;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		CountAccountTest acc1 = new CountAccountTest();
		CountAccountTest acc2 = new CountAccountTest();
		CountAccountTest acc3 = new CountAccountTest();
		System.out
				.println("Number of Objects created of CountAccountTest class: "
						+ count);

		Account a1 = new Account(110);
		Account a2 = new Account(111);
		Account a3 = new Account(112, "Pratibha");
		Account a4 = new Account(113, "Indu", 50000);

		System.out.println("Number of Created Account: " + c);

	}

	public static void setAccountCount(int count) {
		c = c + count;
	}
}