package com.techlabs.login.validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginValidation {
	private Connection con = null;

	public LoginValidation() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost/techlabs",
				"root", "Sangam@123");
	}

	public boolean isAuthoriseUser(String userId, String password) throws SQLException {
		//String userName="",userPassword="";
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM logindb WHERE userId='" + userId
				+ "' && password='" + password + "'";
		ResultSet rs = stmt.executeQuery(sql);
		
		boolean test=false;
		test=rs.next();
		if(test)
				return true;
		else
				return false;
			/*while (rs.next()) {
			userName = rs.getString("userId");
			userPassword = rs.getString("password");
	    }
		if (userId.equals(userName) && password.equals(userPassword))
			return true;
		else
			return false;*/
	}
}
