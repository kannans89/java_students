package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techlabs.bankapp.Account;
import com.techlabs.bankapp.SendEmail;
import com.techlabs.bankapp.Transaction;
import com.techlabs.bankapp.TransactionType;

public class AccountDao {
	Connection conn = SingletoneConnection.getInstance();
	public boolean isAutheriseUser(String name,String password)
	{
		boolean flag=false;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select name,password from bank_master where name=? and password=?");
			pstmt.setString(1,name);
			pstmt.setString(2,password);
			ResultSet rs=pstmt.executeQuery();
			flag=rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public boolean isAvailable(String userName)
	{
		boolean isAvailable=false;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select name from bank_master where name=?");
			pstmt.setString(1,userName);
			ResultSet rst=pstmt.executeQuery();
			if(!rst.next())
				isAvailable=true; 	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isAvailable;
	}
	
	public double getUserBalance(String name){
		Connection conn = null;
		double balance = 0;
		try {
			conn=SingletoneConnection.getInstance();
			PreparedStatement pstmt =conn.prepareStatement("select balance from bank_master where name=?");
			pstmt.setString(1, name);
			ResultSet resultSet = pstmt.executeQuery();		
			if (resultSet.next()){
				balance = resultSet.getDouble("balance");
			}
			System.out.println(balance);
		}catch(Exception e){
			e.printStackTrace();
		}
		return balance;
	}
	
	public String getImage(String name){
		Connection conn=null;
		String img = null;
		try {
			conn=SingletoneConnection.getInstance();
			PreparedStatement pstmt =conn.prepareStatement("select image from bank_master where name=?");
			pstmt.setString(1, name);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next()){
				img = resultSet.getString("image");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return img;
	}
	
	public void registerUser(Account account) throws SQLException {
		SendEmail mail = new SendEmail();
		conn.setAutoCommit(false);
		String acc_no = account.getAccNo();
		String name = account.getName();
		String password = account.getpassword();
		double initialDeposite = account.getInitialDeposite();
		String email = account.getEmail();
		String imgURL=account.getImageURL();
		String subject = "Bank Account Opening";
		String message = "Your MyBank account is sucessfully created..!!\nTo login to MyBank portal use following Credentials\n User Id : "
				+ name + "\nPasswor : " + password;
		try {
			String registerUserQuery = "INSERT INTO bank_master VALUES (?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(registerUserQuery);
			pstmt.setString(1, acc_no);
			pstmt.setString(2, name);
			pstmt.setString(3, password);
			pstmt.setDouble(4, initialDeposite);
			pstmt.setString(5, email);
			pstmt.setString(6,imgURL);
			pstmt.executeUpdate();
			new TransactionDao().createNewtransaction(new Transaction(initialDeposite,TransactionType.D), name);
			conn.commit();
			//mail.sendMail(email, subject, message);
			System.out.println("Account created sucessfully..!!");
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void updateBalance(String name,String type,double amount)
	{
		try
		{
		String transType=type;
		conn.setAutoCommit(false);
		PreparedStatement pstmt1 =conn.prepareStatement("select acc_no,balance from bank_master where name=?");
		pstmt1.setString(1, name);
		ResultSet resultSet = pstmt1.executeQuery();
		String acc_no = null;
		while(resultSet.next())
		{
			acc_no=resultSet.getString(1);
		}
		String updateBalanceQuery;
		if(transType.equals("D"))
			updateBalanceQuery="UPDATE bank_master SET balance=balance+?"
				+ "WHERE acc_no = ?";
		else
			updateBalanceQuery="UPDATE bank_master SET balance=balance-?"
					+ "WHERE acc_no = ?";
		PreparedStatement pstmt = conn.prepareStatement(updateBalanceQuery);
		pstmt.setDouble(1,amount);
		pstmt.setString(2,acc_no);
		pstmt.executeUpdate();
		conn.commit();
		System.out.println("Balance updated");
		}
		catch(Exception e)
		{
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
