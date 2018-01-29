package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationDao {
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
}
