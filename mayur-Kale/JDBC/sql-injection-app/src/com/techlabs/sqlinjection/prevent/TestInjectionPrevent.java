package com.techlabs.sqlinjection.prevent;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class TestInjectionPrevent {
	public static void main(String[] args) {
		Connection con = null;
		Scanner sc = null;
		try {
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost/techlabs", "root", "root");
			sc = new Scanner(System.in);
			System.out.println("Enter name:");

			PreparedStatement statement = (PreparedStatement) con
					.prepareStatement("SELECT * FROM STUDENT WHERE name=?");
			statement.setString(1, sc.nextLine());

			ResultSet resultSet = statement.executeQuery();

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
