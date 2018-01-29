package com.input;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DecryptDecorator extends SwabhavInputDecorator {

	public Cipher cipher;

	public DecryptDecorator(Reader io) {
		super(io);
	}

	@Override
	public void read() throws Exception {
		System.out.print("decrypted code is: ");
		super.io.read();
		decryption();

	}

	public void decryption() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\ncopy and paste above value:");
		String text = sc.next();
		System.out.println("paste your key:");
		String key = sc.next();

		String decryptedString = decrypt(text, key);
		System.out.println("Decrypted Text After Decryption: " + decryptedString);
		System.out.println("Decrption is done.....!!!!!");

	}

	private SecretKeySpec secretKey;
	private byte[] key;

	public void setKey(String myKey) throws Exception {
		MessageDigest sha = null;

		key = myKey.getBytes("UTF-8");
		sha = MessageDigest.getInstance("SHA-1");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16);
		secretKey = new SecretKeySpec(key, "AES");

	}

	public String decrypt(String strToDecrypt, String secret) throws Exception {
		setKey(secret);
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	}
}
