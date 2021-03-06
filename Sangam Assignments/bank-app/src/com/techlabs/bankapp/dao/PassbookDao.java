package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.bankapp.services.PassbookDto;

public class PassbookDao {
	Connection conn = null;
	public List<PassbookDto> getPassbookDetails(String name)
	{
		List<PassbookDto> transactionList = new ArrayList<PassbookDto>();
		try {
			conn=SingletoneConnection.getInstance();

			System.out.println(conn.getCatalog());
			PreparedStatement pstmt =conn.prepareStatement("select acc_no from bank_master where name=?");
			pstmt.setString(1, name);
			ResultSet rst1 = pstmt.executeQuery();

			String acc_no = null;
			if (rst1.next())
				acc_no = rst1.getString(1);
			PreparedStatement pstmt1 =conn.prepareStatement("select * from bank_transaction where acc_no=? order by date desc;");
			pstmt1.setString(1, acc_no);
			ResultSet rst2 = pstmt1.executeQuery();
			
			while (rst2.next()) {
				PassbookDto passbook = new PassbookDto(
						rst2.getString("trans_id"),
						rst2.getString("acc_no"),
						rst2.getDouble("amount"),
						rst2.getString("type"),
						rst2.getString("date"));
				transactionList.add(passbook);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return transactionList;
	}
}
