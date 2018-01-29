package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.techlabs.input.InputReader;

public class TestLogin {

	public static void main(String[] args) throws ClassNotFoundException,
			FileNotFoundException, IOException, SQLException {

		try {
			InputReader reader = new InputReader();
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Properties prop = new Properties();
			prop.load(new FileInputStream("connection.properties"));
			String dburl = prop.getProperty("dburl");
			String user = prop.getProperty("user");
			String psw = prop.getProperty("psw");
			Connection con = DriverManager.getConnection(dburl, user, psw);
			System.out.println("connected to" + con.getCatalog());
			PreparedStatement statement = null;
			ResultSet resultset = null;

			String username = reader.getUserId("Enter User Id");
			String password = reader.getPassword("Enter password");

			String query = "SELECT userid, Password FROM login WHERE userId = '"
					+ username + "' AND Password = '" + password + "'";
			System.out.println(query);

			statement = con.prepareStatement(query);

			resultset = statement.executeQuery();

			if (!resultset.next()) {
				System.out.println("sorry no user found");
			} else {
				System.out.println("welcome");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
