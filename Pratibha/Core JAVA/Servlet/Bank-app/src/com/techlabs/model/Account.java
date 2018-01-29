package com.techlabs.model;

import java.util.UUID;

public class Account {
private String name;
private String accno;
private double balance;
private String email;
private String password;
private String profile;
public Account(String name,String email,String password,String profile){
	this.accno =UUID.randomUUID().toString().replace("-", "");
	this.balance=1000;
	this.setName(name);
	this.setEmail(email);
	this.setPassword(password);
	this.setProfile(profile);
	}
	public Account() {
}
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno){
	this.accno=accno;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPassword(String password){
	this.password=password;
}
public String getPassword() {
	return password;
}
public String getProfile() {
	return profile;
}
public void setProfile(String profile) {
	this.profile = profile;
}
}
