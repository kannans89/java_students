package com.techlabs.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.commons.UserType;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;

@Service
public class UserService {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public char login(int id, String password, UserType userType) {
		User user = getUser(id, userType);
		boolean validUser = user.validate(password);
		if (validUser) {
			return user.getStatus();
		}
		throw new BankingException("UserId and password do not match");
	}

	@Transactional
	public void changePassword(int id, UserType userType, String currentPassword, String newPassword) {
		User userToUpdate = getUser(id, userType);
		boolean validUser = userToUpdate.validate(currentPassword);
		if (validUser) {
			userToUpdate.changePassword(newPassword);
		} else
			throw new BankingException("Incorrect Current Password");
	}

	@Transactional
	public void resetPassword(int id, UserType userType, String mobile, String email) {
		User user = getUser(id, userType);
		boolean validUser = user.validateDetails(mobile, email);
		if (validUser) {
			user.changeStatusTo('I');
			user.generateOTP();
		} else
			throw new BankingException("Incorrect contact details");
	}

	private User getUser(int id, UserType userType) {
		User user = (User) sessionFactory.getCurrentSession().get(userType.getUser().getClass(), id);
		if (user != null)
			return user;
		else
			throw new BankingException("Invalid User");
	}
}
