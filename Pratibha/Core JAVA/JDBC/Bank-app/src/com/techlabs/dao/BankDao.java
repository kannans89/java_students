package com.techlabs.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.connection.SingletonConnection;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;

public class BankDao {
	String name;
	public SingletonConnection dao = SingletonConnection.getInstance();
	public Connection con = (Connection) dao.getConnection();
	List<Transaction> translist = new ArrayList<Transaction>();
	private Account account = new Account();
	private Transaction transaction = new Transaction();

	public boolean getLogin(String name, String password) {
		this.name = name;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from bankmaster where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				rs.previous();
				while (rs.next()) {
					System.out.println("rs" + rs.getString(1));
					account.setAccno(rs.getString(1));
					account.setName(rs.getString(2));
					account.setPassword(rs.getString(3));
					account.setBalance(rs.getDouble(4));
					account.setEmail(rs.getString(5));
					account.setProfile(rs.getString(6));
					setAccount(account);
				}
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Account getAccountData(String name2) {
		System.out.println("getAccountData");
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from bankmaster where name=?");
			ps.setString(1, name2);
			rs = ps.executeQuery();
			System.out.println("rs");
			System.out.println(rs.next());
			if (rs.next()) {
				rs.previous();
				while (rs.next()) {
					System.out.println("present"+rs.getString(2));
					account.setAccno(rs.getString(1));
					account.setName(rs.getString(2));
					account.setPassword(rs.getString(3));
					account.setBalance(rs.getDouble(4));
					account.setEmail(rs.getString(5));
					account.setProfile(rs.getString(6));
					setAccount(account);
				}
				System.out.println("account present"+account.getBalance());
				return account;
			}
			else return account;
		} catch (SQLException e) {
			e.printStackTrace();
			return account;
		}
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return this.account;
	}

	public void addAccount(Account account) {
		PreparedStatement ps;

		ResultSet rs = null;
		

		try {
			ps = (PreparedStatement) con
					.prepareStatement("insert into bankmaster values(?,?,?,?,?,?)");
			ps.setString(1, account.getAccno());
			ps.setString(2, account.getName());
			ps.setString(3, account.getPassword());
			ps.setDouble(4, account.getBalance());
			ps.setString(5, account.getEmail());
			ps.setString(6, account.getProfile());
			System.out.println(account.getProfile());
			ps.execute();
System.out.println("Account is added.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void widthdraw(double amount, String name, Transaction transaction) {
		PreparedStatement ps;
		try {
			con.setAutoCommit(false);
			ps = (PreparedStatement) con
					.prepareStatement("update bankmaster set balance=balance-? where name=?");
			ps.setDouble(1, amount);
			ps.setString(2, name);
			ps.executeUpdate();

			this.makeTranscation(transaction);
			con.commit();
			getAccountData(name);

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public void deposite(double amount, String name, Transaction transaction) {
		PreparedStatement ps;
		try {
			con.setAutoCommit(false);
			ps = (PreparedStatement) con
					.prepareStatement("update bankmaster set balance=balance+? where name=?");
			ps.setDouble(1, amount);
			ps.setString(2, name);
			ps.executeUpdate();

			this.makeTranscation(transaction);
			con.commit();

			getAccountData(name);
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	public void makeTranscation(Transaction transaction) {
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("insert into transactionmaster(transid,accno,amount,type,date) "
							+ "values(?,?,?,?,?)");
			ps.setString(1, transaction.getTransid());
			ps.setString(2, transaction.getAccno());
			ps.setDouble(3, transaction.getAmount());
			ps.setString(4, transaction.getType());
			ps.setDate(5, transaction.getDate());
			ps.execute();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public List<Transaction> getTransactionsList(String accno) {
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from transactionmaster where accno=?");
			ps.setString(1, accno);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Transaction transaction = new Transaction();
					System.out.println("list");
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					transaction.setTransid(rs.getString(1));
					transaction.setAccno(rs.getString(2));
					transaction.setAmount(rs.getDouble(3));
					transaction.setType(rs.getString(4));
					transaction.setDate(rs.getDate(5));
					translist.add(transaction);
				}
			}
			return translist;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
