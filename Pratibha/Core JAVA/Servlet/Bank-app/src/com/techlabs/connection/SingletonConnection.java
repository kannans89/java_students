package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection 
{
	Connection con=null;
	private static SingletonConnection studentdao = null;

	private SingletonConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SingletonConnection getInstance() {
		if (studentdao == null) {
			studentdao = new SingletonConnection();
		}
		return studentdao;
	}

	public Connection getConnection() {
		if(con==null){
		try {
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		return con;
	}


}
