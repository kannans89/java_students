package com.techlabs.fitness.validation.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public boolean isAuthoriseUser(String userId, String password) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/techlabs",
				"root", "Sangam@123");
		String sql = "SELECT userId , password FROM logindb WHERE userId=? and password=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,userId);
		pstmt.setString(2,password);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
	}
}
