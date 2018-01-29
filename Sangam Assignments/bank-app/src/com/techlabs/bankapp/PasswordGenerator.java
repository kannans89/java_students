package com.techlabs.bankapp;

import java.security.SecureRandom;

public class PasswordGenerator {
	public String genetatePassword(int len)
	{
		String generatePass = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for( int i = 0; i < len; i++ ) 
			   sb.append( generatePass.charAt( rnd.nextInt(generatePass.length()) ) );
		return sb.toString();
	}

}
