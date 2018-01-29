package com.techlabs.jdbc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techlabs.jdbc.DatabaseConnector;
import com.techlabs.jdbc.DatabaseReader;

public class Service {
	DatabaseConnector dbcon;
	DatabaseReader dbreader;

	public Service() {
		dbcon = new DatabaseConnector();
		dbreader = new DatabaseReader();
	}

	public void start() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String name, pwd;

		Connection con = dbcon.connectToDB();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter username and password:");
			name = reader.readLine();
			pwd = reader.readLine();
			ResultSet rs = dbreader.readDetails(con, name, pwd);
			try {
				if (rs.next()) {
					System.out.println("Login Successful");
					return;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Login failed.. try again");
		}
		throw new RuntimeException("MAX ATTEMPT LIMIT REACHED");
	}

}
