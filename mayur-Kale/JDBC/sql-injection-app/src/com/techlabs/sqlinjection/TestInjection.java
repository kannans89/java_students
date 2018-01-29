package com.techlabs.sqlinjection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestInjection {
	public static void main(String[] args) {
		Connection con = null;
		Scanner sc = null;
		try {
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost/techlabs", "root", "root");
			sc = new Scanner(System.in);
			System.out.println("Enter name:");

			Statement statement = (Statement) con.createStatement();

			String query = "select * from STUDENT WHERE name='" + sc.nextLine()
					+ "'";

			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.isBeforeFirst()) {
				System.out.println("Roll No\tName\tAge");
				System.out.println("===================");
			} else
				System.out.println("No result found!");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t"
						+ resultSet.getString(2) + "\t" + resultSet.getInt(3));
			}

		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			sc.close();
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}
