package com.techlab.fitness.tracker.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public boolean validateUser(String username,String password){
		boolean flag=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techlabs", "root", "sandeep");
			System.out.println(connection.getCatalog());
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement("select 1 from employee where username=? and password=?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			flag = resultSet.next();
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
}
