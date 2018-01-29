package com.techlabs.student.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DmlOperations {
	private Connection con = null;
	private PreparedStatement pstmt=null;
	private String sql;
	private int noOfRowUpdated=0;
	public DmlOperations() throws SQLException
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost/techlabs",
				"root", "Sangam@123");
	}
	public void insertRecord(int id, int rollNo, String name)
			throws SQLException {
		sql = "INSERT INTO studentdb VALUES (?,?,?)";
		noOfRowUpdated=0;
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setInt(2, rollNo);
		pstmt.setString(3, name);
		noOfRowUpdated=pstmt.executeUpdate();
		if(noOfRowUpdated>0)
			System.out.println("Record inserted sucessFully");
	}
	public void deleteRecord(int id) throws SQLException
	{
		 noOfRowUpdated=0;
		 sql="DELETE FROM studentdb WHERE id = ?";
		 pstmt = con.prepareStatement(sql);
		 pstmt.setInt(1, id);
		 noOfRowUpdated=pstmt.executeUpdate();
         if(noOfRowUpdated>0)
 			System.out.println("Record deleted sucessFully");	
    }
	public void updateRecord(int id,int rollNo,String name) throws SQLException
	{
		noOfRowUpdated=0;
		sql = "UPDATE studentdb SET rollNo=?, name=? WHERE id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,rollNo);
		pstmt.setString(2,name);
		pstmt.setInt(3,id);
		noOfRowUpdated=pstmt.executeUpdate();
		if(noOfRowUpdated>0)
 			System.out.println("Record updated sucessFully");
	}
	public void ShowRecords() throws SQLException
	{
		sql="select * from studentdb";
		pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		System.out.println("Id RollNo Name");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getInt(2)+"   "+rs.getString(3));
		}
	}
}
