package com.techlabs.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service("sendEmailService")
public class SendEmailService {
	
	public SendEmailService() {
		System.out.println("Send Email Service");
	}
	
	public void sendEmail(String email, String subject, String body)
	{
		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");   
        
         Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator()
         {protected PasswordAuthentication getPasswordAuthentication(){
        	 return new PasswordAuthentication("santy.java.email@gmail.com","santy@123");}}); 
         
         try {    
          MimeMessage message = new MimeMessage(session);    
          message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));    
          message.setSubject(subject);    
          message.setText(body);    
          Transport.send(message);    
          System.out.println("Email sent successfully");    
         } catch (MessagingException e) {throw new RuntimeException(e);}  
	}
}
