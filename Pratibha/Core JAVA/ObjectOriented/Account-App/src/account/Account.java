package account;

public class Account {
	private String name;
	private int accNo;
	private AccountType type;
	private double balance;

	public Account(int accNo, String name) {
		this(accNo, name, 500, AccountType.SAVING);
	}

	public Account(int accNo, String name, double balance, AccountType type) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.type = type;
	}

	public void deposite(double amount) {
		System.out.println(this.name + " want to deposite Rs." + amount);
		try{
		if(amount<0){
			throw new NegativeBalanceException("Cann't deposite Negative Amount");
		}
		else{
		this.balance = this.balance + amount;
		System.out.println(this.name + " has deposited Rs." + amount + " successfully");
		}
		}
		catch(NegativeBalanceException ex){
			ex.getMessage();
		}
		
	}
	public void withdraw(double amount) throws NegativeBalanceException {
		try {
			System.out.println(this.name + " want to withdwaw Rs." + amount);
			if (this.balance - amount < 0)
				throw new NegativeBalanceException("not valid amount");
			else {
				System.out.println(this.name + " has withdwawed Rs." + amount
						+ " successfully");
				this.balance = this.balance - amount;
			}
		} catch (NegativeBalanceException ex) {

			System.out
					.println("NegativaBalanceException occured.Cannot withdraw this amount");
		}
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAccountType() {
		return type;

	}

	public int getAccountNo() {
		return accNo;
	}
}
