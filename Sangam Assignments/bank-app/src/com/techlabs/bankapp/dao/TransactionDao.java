package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.techlabs.bankapp.SendEmail;
import com.techlabs.bankapp.Transaction;
import com.techlabs.bankapp.TransactionType;

public class TransactionDao {
	
	public void createNewtransaction(Transaction transaction,String name)
	{
		Connection conn = SingletoneConnection.getInstance();
		SendEmail mail = new SendEmail();
		try {

			String transId = transaction.getTransId();
			Timestamp time = transaction.getTransactionDateAndTime();
			TransactionType type = transaction.getTransactionType();
			double amount=transaction.getAmount();
			PreparedStatement pstmt1 =conn.prepareStatement("select acc_no,balance from bank_master where name=?");
			pstmt1.setString(1, name);
			ResultSet resultSet = pstmt1.executeQuery();
			String acc_no = null;
			double balance=0;
			if (resultSet.next()){
				acc_no = resultSet.getString(1);
				balance=resultSet.getDouble(2);
			}
			if(type.equals(TransactionType.D)){
				balance=balance+amount;
			}
			else{
				balance=balance-amount;
			}
			String transTableQuery = "INSERT INTO bank_transaction VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(transTableQuery);
			pstmt.setString(1, transId);
			pstmt.setString(2, acc_no);
			pstmt.setDouble(3,balance);
			pstmt.setString(4, type.toString());
			pstmt.setTimestamp(5, time);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
