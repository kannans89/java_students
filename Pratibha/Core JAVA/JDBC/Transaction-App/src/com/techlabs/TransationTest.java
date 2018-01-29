package com.techlabs;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransationTest {
	public static void main(String args[]) {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav", "root", "root");
			con.setAutoCommit(false);
			System.out.println("Enter Bill Amount");
			double bill = sc.nextDouble();
			System.out.println("Enter Customer ID");
			int custID = sc.nextInt();
			System.out.println("Enter Marchant ID");
			int marchID = sc.nextInt();
			PreparedStatement ps1;
			PreparedStatement ps2;
			ps1 = (PreparedStatement) con
					.prepareStatement("UPDATE marchant SET balance=balance+? where id=?");
			ps1.setDouble(1, bill);
			ps1.setInt(2, marchID);
			ps1.executeUpdate();
			ps2 = (PreparedStatement) con
					.prepareStatement("UPDATE customer SET balance=balance-? where id=?");
			ps2.setDouble(1, bill);
			ps2.setInt(2, custID);
			ps2.executeUpdate();
			con.commit();

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		}

	}
}
