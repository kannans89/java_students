package com.techlabs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LoginService {
	public StudentDao dao = StudentDao.getInstance();
	public Connection con = (Connection) dao.getConnection();

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
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3));
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}