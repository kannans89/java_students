package com.output;


import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;




public class EncryptDecorator extends SwabhavOutputDecorator {

	private  Cipher cipher;
	private byte[] key;
	private SecretKeySpec secretKey;

	public EncryptDecorator(Writer writer) {
		super(writer);
	}
	
	@Override
	public void write(String s) throws Exception {
		Encypt(s);
		
	}
     
	public void Encypt(String text) throws Exception {
		
		 final String secretKey;
		 
		 Scanner sc=new Scanner(System.in);
		System.out.println("Set your key:");
	     secretKey =sc.next();
	   
		String encryptedString = encrypt(text, secretKey) ;
		System.out.println("Encyption is done....!!!!");
		super.io.write(encryptedString);
		
	}

	public  void setKey(String myKey) throws Exception 
    {
        MessageDigest sha = null;
       
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            secretKey = new SecretKeySpec(key, "AES");
       
    }
	public  String encrypt(String strToEncrypt, String secret)
			throws Exception {

        setKey(secret);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
   
	}

	
}
