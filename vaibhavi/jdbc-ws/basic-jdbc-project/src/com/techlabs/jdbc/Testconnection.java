package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Testconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			String dburl="jdbc:mysql://localhost:3306/techlabs";
			String user="root";
			String psw="oracle";
			Connection con= DriverManager.getConnection(dburl, user, psw);
			System.out.println("connected to" +con.getCatalog());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
