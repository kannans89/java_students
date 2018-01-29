package com.techlabs.model;
import java.sql.Date;
import java.util.UUID;

public class Transaction {
private String transid;
private String accno;
private String type;
private Date date;
private double amount;

public Transaction(String accno, double amount, String transtype, Date date){
	this.transid=UUID.randomUUID().toString().replace("-", "");
	this.setAccno(accno);
	this.setAmount(amount);
	this.setType(transtype);
	this.setDate(date);
}

public Transaction() {
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
	
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getTransid() {
	return transid;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno){
	this.accno=accno;
}

public void setTransid(String transid) {
	this.transid=transid;
}
}
