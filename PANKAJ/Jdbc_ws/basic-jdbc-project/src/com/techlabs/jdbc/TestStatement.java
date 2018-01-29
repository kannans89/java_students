package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.techlabs.jdbc.TestConnection.*;

public class TestStatement {
	static Statement statement;

	static {
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertDetails(String query, Connection con) {
		try {
			statement.executeUpdate(query);
			System.out.println("Record inserted to DB");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchDetails(String query) {
		try {
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("Name") + " "
						+ rs.getString("Address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
