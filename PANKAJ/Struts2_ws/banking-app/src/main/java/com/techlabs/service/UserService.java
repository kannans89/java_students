package com.techlabs.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.action.form.UserType;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;

@Service
public class UserService {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public User login(int id, String password, UserType userType) {
		User user = getUser(id, userType);
		if (user != null) {
			if (user.validate(password)) {
				return user;
			}
		}
		throw new BankingException("Invalid User");
	}

	@Transactional
	public void changePassword(int id, UserType userType, String currentPassword, String newPassword) {
		User userToUpdate = getUser(id, userType);
		boolean validUser = userToUpdate.validate(currentPassword);
		if (validUser) {
			userToUpdate.changePassword(newPassword);
		} else
			throw new BankingException("Invalid User");
	}

	@Transactional
	public void forgotPassword(int id, UserType userType, String mobile, String email) {
		User user = getUser(id, userType);
		boolean validUser = user.validateDetails(mobile, email);
		if (validUser) {
			user.changeStatusTo('I');
			user.generateOTP();
		} else
			throw new BankingException("Wrong Details");
	}

	private User getUser(int id, UserType userType) {
		return (User) sessionFactory.getCurrentSession().get(userType.getUser().getClass(), id);
	}

	/*
	 * User getUser(int id, String classname) { try { return (User)
	 * sessionFactory.getCurrentSession().get(Class.forName(classname), id); }
	 * catch (HibernateException e) { } catch (ClassNotFoundException e) { }
	 * return null; }
	 */
}
