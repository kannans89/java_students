package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletoneConnection{
	private static Connection conn=null;
	private SingletoneConnection()
	{
	}
	public static Connection getInstance()
	{
			if(conn==null)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					conn =DriverManager.getConnection("jdbc:mysql://localhost/techlabs",
						"root", "Sangam@123");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}		
			}
		return conn;
	}
}
		
