package com.techlabs.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.techlabs.dao.UserDao;
import com.techlabs.dto.UserDto;
import com.techlabs.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public UserService() {

	}

	@Transactional
	public List<User> getUsers() {
		List<User> userList = userDao.getEmployees();
		Hibernate.initialize(userList);
		return userList;
	}

	@Transactional
	public User getUser(String username) {
		User user = userDao.getEmployee(username);
		return user;
	}

	@Transactional
	public void addUser(UserDto userDto) {
		User user = new User(userDto.getName(), userDto.getUserName(),
				userDto.getDept(), userDto.getMail(), userDto.getPhoneNo());
		userDao.add(user);
	}

	@Transactional
	public void update(UserDto userDto) {
		User user = userDao.getUser(userDto.getUserId());
		user.setName(userDto.getName());
		user.setDept(userDto.getDept());
		user.setEmail(userDto.getMail());
		user.setMobileno(userDto.getPhoneNo());

	}

	@Transactional
	public void delete(int id) {
		User user = userDao.getUser(id);

	}

	@Transactional
	public UserDto getUserByMail(String mail) {
		User user = userDao.getUserByMail(mail);
		if (user != null) {
			UserDto userDto = new UserDto();
			userDto.setUserId(user.getId());
			userDto.setName(user.getName());
			userDto.setDept(user.getDept());
			userDto.setMail(user.getEmail());
			userDto.setUserName(user.getUsername());
			return userDto;
		}
		return null;
	}

	public void sendMail(String recipent, String username, String userPassword) {
		final String user = "sanky.patil17691@gmail.com";
		final String password = "9890412485S@nkY";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(user, password);
					}
				});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					recipent));
			message.setSubject("user details");
			message.setText("username: " + username + "\npassword : "
					+ userPassword);

			Transport.send(message);

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}
