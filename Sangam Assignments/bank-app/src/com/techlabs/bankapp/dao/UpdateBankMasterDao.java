package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techlabs.bankapp.TransactionType;

public class UpdateBankMasterDao {
	public void updateBalance(String name,String type,double amount)
	{
		Connection conn = SingletoneConnection.getInstance();
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
