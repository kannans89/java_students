package com.techlabs.bankapp;

import java.util.UUID;

public class Account {
	private String acc_no;
	private String name;
	private String email;
	private double initialDeposite;
	private String password;
	private String imgURL;
	public Account(String name, String email,String password,String img)
	{
		this.name=name;
		this.email=email;
		this.password=password;
		imgURL=img;
		setAccNo();
		setInitialDeposite();
	}
	public String getAccNo()
	{
		return acc_no;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public String getpassword()
	{
		return password;
	}
	public String getImageURL()
	{
		return imgURL;
	}
	private void setAccNo()
	{
		UUID uuid=UUID.randomUUID();
		acc_no=uuid.toString().replace("-","");
	}
	private void setInitialDeposite()
	{
		initialDeposite=1000;
	}
	public double getInitialDeposite()
	{
		return initialDeposite;
	}
}

/*public void registerUser(String name,String email)
{
	String acc_no=getNewAccNo();
	String password=new genetatePassword(4);
	double balance=getInitialBalance();
	new RegisterDao().registerUser(acc_no, name, password, balance, email);
}
*/
