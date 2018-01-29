package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class StudentDao {
	Connection con=null;
	private static StudentDao dao = null;

	private StudentDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static StudentDao getInstance() {
		if (dao == null) {
			dao = new StudentDao();
		}
		return dao;
	}

	public Connection getConnection() {
		if(con==null){
		try {
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav", "root", "root");
			 System.out.println("catlog:"+con.getCatalog());
			 System.out.println("class:"+con.getClass());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		return con;
	}
}
