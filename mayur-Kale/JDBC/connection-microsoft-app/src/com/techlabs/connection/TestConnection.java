package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {
		String dbURL = "jdbc:sqlserver://localhost;";
		String user = "root";
		String pass = "root";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbURL, user, pass);
			System.out.println(conn.getCatalog());
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select * from student");
			while (resultSet.next()) {
				System.out.println("{Roll No:" + resultSet.getInt(1) + ",Name:"
						+ resultSet.getString(2) + ",Age:"
						+ resultSet.getInt(3) + "}");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}

}
