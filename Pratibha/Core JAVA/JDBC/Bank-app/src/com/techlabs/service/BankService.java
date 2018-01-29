package com.techlabs.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.techlabs.dao.BankDao;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;

public class BankService {
	private BankDao bankdao;
	private Account account;
	private String accno;
public BankService(){
	bankdao = (BankDao) new BankDao();
	account=new Account();
}
	public boolean getAuthentication(String name, String password) {
		boolean login = bankdao.getLogin(name, password);
		if (login) {
			account = bankdao.getAccount();
			System.out.println("bankdao.account.accno" + account.getAccno());
			this.accno = account.getAccno();
			return true;
		} else
			return false;
	}

	public void register(String name, String email, String profile) {
		PasswordGenerationService pgs = new PasswordGenerationService();
		String name2=name;
		String password = pgs.generatePassword(8);
		Account account = new Account(name2, email, password,profile);
		bankdao.addAccount(account);
Mailer.send("dhodipd@gmail.com", "omshriram21", email,
				"Your Passwor is", password);

	}

	public Account getAccount() {
		return account;
	}

	public double doTransaction(double amount, String transtype, String name, String accno) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
String user;
		System.out.println(dateFormat.format(date));
		System.out.println(transtype);
		System.out.println(date);
		//String accno = bankdao.getAccountData(name).getAccno();
		System.out.println("Do transaction accno: " + accno);
		Transaction transaction = new Transaction(accno, amount, transtype,
				date);

		if (transtype.equals("W")) {
			bankdao.widthdraw(amount, name, transaction);
			user=name;
			System.out.println("amount"+user+bankdao.getAccount().getBalance()
					+"   "+bankdao.getAccountData(user).getEmail());

			return bankdao.getAccount().getBalance();
		} else {
			bankdao.deposite(amount, name, transaction);
			user=name;
			System.out.println("amount"+bankdao.getAccount().getBalance()
					+"   "+bankdao.getAccountData(user).getEmail());
			return bankdao.getAccountData(user).getBalance();

		}}

	public List<Transaction> getTransactions(String accno) {
		System.out.println(accno);
		List<Transaction> translist = bankdao.getTransactionsList(accno);
		System.out.println(translist);
		return translist;
	}

	public boolean isAvailable(String name) {
		account = bankdao.getAccountData(name);
		System.out.println(account);
		System.out.println("accno in isavailable");
		System.out.println(account.getAccno());
		if (account.getAccno()==null){
			System.out.println("false");
			return false;
		}
		else{
			System.out.println("true");
			return true;
		}
	}
}
