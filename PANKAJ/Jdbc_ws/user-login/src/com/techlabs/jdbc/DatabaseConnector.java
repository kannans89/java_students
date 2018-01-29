package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	static Connection con;

	public Connection connectToDB() {
		try {
			Class.forName(ConnectionDetails.getString("driver"));
			String dburl = ConnectionDetails.getString("dburl");
			String user = ConnectionDetails.getString("userName");
			String pwd = ConnectionDetails.getString("password");
			con = DriverManager.getConnection(dburl, user, pwd);
			System.out.println("Connected to: " + con.getCatalog());
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
