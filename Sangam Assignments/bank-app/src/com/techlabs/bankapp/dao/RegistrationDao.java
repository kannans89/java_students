package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.techlabs.bankapp.Account;
import com.techlabs.bankapp.SendEmail;
import com.techlabs.bankapp.Transaction;
import com.techlabs.bankapp.TransactionType;

public class RegistrationDao {
		public void registerUser(Account account) throws SQLException {
		Connection conn = SingletoneConnection.getInstance();
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
}
