package com.techlabs.dao;

import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.techlabs.dto.UserDto;
import com.techlabs.entity.User;

@Repository
public class UserDao {

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public User getUserByUsername(String username) {
		String hql = "FROM User U WHERE U.username = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, username);
		List<User> users = query.list();
		if (null != users && !users.isEmpty()) {
			User user = (User) users.get(0);
			int userId = user.getUserId();
			System.out.println(userId);
			return (User) sessionFactory.getCurrentSession().get(User.class, userId);
		}
		return null;
	}

	public void addUser(UserDto userDto) {
		User user = new User(userDto.getUsername(), userDto.getPassword(), userDto.getEmail());
		sessionFactory.getCurrentSession().save(user);
	}

	public void sendEmail(int randomNumber, String email) {
		final String from = "sanketborhade0@gmail.com";
		final String password = "SanketBorhade9920350257";
		String to = email;
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.user", from);
		properties.setProperty("mail.password", password);
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.socketFactory.port", "465");
		properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		};

		Session session = Session.getDefaultInstance(properties, auth);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("*** IMPORTANT *** Password Change !");
			message.setText("Hello,\n\nYour Password for Task Manager Application has been changed."
					+ "\nNew Password for application is " + randomNumber
					+ "\nRemember to update your password once you login.\n\nThank you!");
			Transport.send(message);
			System.out.println("Sent Mail Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}