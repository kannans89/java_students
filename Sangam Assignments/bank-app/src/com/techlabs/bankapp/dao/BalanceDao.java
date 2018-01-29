package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BalanceDao {
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
}
