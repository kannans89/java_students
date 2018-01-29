package com.techlabs.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techlabs.dao.BookStoreDao;

public class LoginService {
	public  BookStoreDao dao = BookStoreDao.getInstance();
	public Connection con = dao.getConnection();

	public LoginService() {

	}

	@SuppressWarnings("unchecked")
	public boolean getAuthentication(String user, String password) {
		PreparedStatement ps;
		boolean status=false;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from logincredentials where user='"
							+ user + "' AND password='" + password + "'");
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}
