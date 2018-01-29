package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class LoginDao {

public static boolean validate(String user,String password){
boolean status=false;
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
	
	PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from logincredentials where user='"+user+"' AND password='"+password+"'");
		ResultSet rs=ps.executeQuery();
	status=rs.next();
	
	while (rs.next())
		System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "+ rs.getString(3));
	con.close();

	
	
}catch(Exception e){System.out.println(e);}


return status;
}
}
