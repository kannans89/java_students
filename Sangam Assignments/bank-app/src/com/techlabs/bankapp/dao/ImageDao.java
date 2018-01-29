package com.techlabs.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageDao {
	public String getImage(String name){
		Connection conn=null;
		String img = null;
		try {
			conn=SingletoneConnection.getInstance();
			PreparedStatement pstmt =conn.prepareStatement("select image from bank_master where name=?");
			pstmt.setString(1, name);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next()){
				img = resultSet.getString("image");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return img;
	}
}
