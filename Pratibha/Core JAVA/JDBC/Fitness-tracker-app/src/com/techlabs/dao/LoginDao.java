package com.techlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class LoginDao {
	int i=0;
	Connection con=null;
	public LoginDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:4040/swabhav", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				System.out.println("catlog:"+con.getCatalog());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("class:"+con.getClass());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean getLoginCredentials(String user,String password) {
		PreparedStatement ps;
		boolean isvalid=false;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from logincredentials where user=? and password=?");
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
		if(rs!=null){
		 isvalid=true;
		}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isvalid;
	}
public int getLoginCredentialLength(){
	
	return this.i;
	
}

}
