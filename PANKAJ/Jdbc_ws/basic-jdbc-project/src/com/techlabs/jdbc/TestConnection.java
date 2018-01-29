package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	static Connection con;

	public static void main(String[] args) {
		connectToDB();
		insertRow();
		fetchDetails();
	}

	public static void connectToDB() {
		try {
			Class.forName(Messages.getString("driver"));
			System.out.println("Drivers loaded");
			String dburl = Messages.getString("dburl");
			String user = Messages.getString("userName");
			String pwd = Messages.getString("password");
			con = DriverManager.getConnection(dburl, user, pwd);
			System.out.println("Connected to: " + con.getCatalog());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertRow() {
		String query = Messages.getString("insertQuery");
		TestStatement.insertDetails(query, con);
	}

	public static void fetchDetails() {
		String query = Messages.getString("selectQuery");
		TestStatement.fetchDetails(query);
	}
}
