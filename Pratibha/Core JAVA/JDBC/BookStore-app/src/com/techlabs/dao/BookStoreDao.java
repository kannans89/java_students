package com.techlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BookStoreDao {
	Connection con=null;
	private static BookStoreDao bookstoredao = null;

	private BookStoreDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static BookStoreDao getInstance() {
		if (bookstoredao == null) {
			bookstoredao = new BookStoreDao();
		}
		return bookstoredao;
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
