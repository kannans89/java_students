package com.techlabs.connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestConnection {
	public static void main(String[] args) {

		Connection con = null;

		try {
			con = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/techlabs?user=root&password=root");

			System.out.println(con.getClass());
			System.out.println("Connection is opened");
			System.out.println("Connected to Database: " + con.getCatalog());

			Statement statement = (Statement) con.createStatement();

			ResultSet resultSet = statement
					.executeQuery("select * from student");
			if (resultSet.isBeforeFirst()) {
				System.out.println("Rollno \t Name \t Age");
				System.out.println("======================");
			} else {
				System.out.println("No result found!");
			}
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t"
						+ resultSet.getString(2) + "\t" + resultSet.getInt(3));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}
}
