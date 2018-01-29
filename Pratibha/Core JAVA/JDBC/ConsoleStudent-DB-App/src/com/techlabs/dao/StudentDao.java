package com.techlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class StudentDao {
	Connection con=null;
	private static StudentDao studentdao = null;

	private StudentDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static StudentDao getInstance() {
		if (studentdao == null) {
			studentdao = new StudentDao();
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
