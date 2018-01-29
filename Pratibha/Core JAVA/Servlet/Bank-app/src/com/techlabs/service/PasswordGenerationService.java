package com.techlabs.service;

import java.security.SecureRandom;

public class PasswordGenerationService {
	private String AB;
	private SecureRandom rnd;

	public PasswordGenerationService() {
		AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		rnd = new SecureRandom();
		System.out.println(rnd);
	}

	public String generatePassword(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
}
