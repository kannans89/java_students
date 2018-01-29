package com.techlabs.login.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.techlabs.login.validation.LoginValidation;
import java.sql.Connection;
public class LoginTest {
	private static Scanner sc = null;

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/techlabs",
				"root", "Sangam@123");
		sc = new Scanner(System.in);
		System.out.println("Enter user Id : ");
		String userId = sc.nextLine();
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM logindb WHERE userId='" + userId
				+ "' && password='" + password + "'";
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next())
			System.out.println("sucessful");
		else
			System.out.println("failure");
				
	}

}


/*if (validation.isAuthoriseUser(userId, password))
System.out.println("Authentication Sucessfull...\nWelcome..!!");
else
System.out
		.println("Authentication Failure..!!\nPlease Enter valid user name and Password");*/