package com.techlabs.bankapp;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {
	public void sendMail(String to,String subject,String message)
	{
		String from="sangam5.test@gmail.com";
		String password="Sangam@123";
    	    	
    	Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() 
        {    
         protected PasswordAuthentication getPasswordAuthentication()
         {    
        	 return new PasswordAuthentication(from,password);  
        }
        });    
        try {    
         MimeMessage mimeMessage = new MimeMessage(session);    
         mimeMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         mimeMessage.setSubject(subject);    
         mimeMessage.setText(message);    
         Transport.send(mimeMessage);    
         System.out.println("message sent successfully");    
        } 
        catch (MessagingException e) 
        {
        	throw new RuntimeException(e);
        }
	}

}
