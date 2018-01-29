package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionTest {
private static Connection con=null;
	public static void main(String[] args) {
		try
		{
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:4040/techlabs","root","Sangam@123"); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id : ");
		int custId=sc.nextInt();
		System.out.println("Enter Check out Price : ");
		double checkOutPrice=sc.nextDouble();
		System.out.println("Enter merchant id : ");
		int merchantId=sc.nextInt();
		con.setAutoCommit(false);
		String updateCustomerBalance = "UPDATE customer SET balance=balance-? "
				+ "WHERE id = ?";
		PreparedStatement pstmt1=con.prepareStatement(updateCustomerBalance);
		pstmt1.setDouble(1,checkOutPrice);
		pstmt1.setInt(2,custId);
		pstmt1.executeUpdate();
		
		String updateMerchantBalance = "UPDATE merchant SET balance=balance+? "
				+ "WHERE id = ?";
		PreparedStatement pstmt2 = con.prepareStatement(updateMerchantBalance);
		
		pstmt2.setDouble(1,checkOutPrice);
		pstmt2.setInt(2,merchantId);
		pstmt2.executeUpdate();
		con.commit();
		}
		catch(SQLException e)
		{
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}