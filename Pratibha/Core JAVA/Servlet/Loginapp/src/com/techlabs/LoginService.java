package com.techlabs;

import java.util.TreeMap;

public class LoginService {
	public LoginService() {
	
	}
	
	@SuppressWarnings("rawtypes")
	public TreeMap getIdPassword(){
	TreeMap<String, String> idPasswordMap= new TreeMap<String, String>();
	idPasswordMap.put("admin", "admin");
	idPasswordMap.put("student1", "student1");
	idPasswordMap.put("Pratibha", "password123");
	idPasswordMap.put("ABCD","abcd");
	return idPasswordMap;
	}
	@SuppressWarnings("unchecked")
	public boolean getAuthentication(String id,String password){
		TreeMap<String,String> idpass=getIdPassword();
		if(idpass.get(id).equals(password))	{
			return true;
		}
		else
		return false;
	}
	
}