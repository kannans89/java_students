package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader {

	public ResultSet readDetails(Connection con, String name, String pwd) {

		try {
			Statement statement = con.createStatement();
			ResultSet rs = statement
					.executeQuery("select * from user where name='" + name
							+ "' and password='" + pwd + "'");
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
