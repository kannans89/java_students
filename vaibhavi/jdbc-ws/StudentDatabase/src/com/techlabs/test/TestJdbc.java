package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestJdbc {

	
		public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
			// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded successfully");
				Properties prop = new Properties();
				prop.load(new FileInputStream("connection.properties"));
				String dburl=prop.getProperty("dburl");
				String user=prop.getProperty("user");
				String psw=prop.getProperty("psw");
				Connection con= DriverManager.getConnection(dburl, user, psw);
				System.out.println("connected to" +con.getCatalog());
				PreparedStatement statement = null;
			    ResultSet resultset = null;
			    String query = "select * from students";
			    statement = con.prepareStatement(query);
			    resultset= statement.executeQuery();
	            while(resultset.next()){
	                System.out.println(resultset.getInt("id")+ " "+ resultset.getString("name") +" " +resultset.getString("location"));
	            }
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
