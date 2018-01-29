package com.techlabs.services;

import java.util.List;

import com.techlabs.dao.UserDao;
import com.techlabs.entity.User;

public class UserService {
	UserDao userDao;

	public UserService() {
		// TODO Auto-generated constructor stub
		this.userDao = new UserDao();
	}

	public List<User> getUserList() {
		return this.userDao.getUserList();
	}
	public boolean isAuthenticate(String uid, String pass) {
		return this.userDao.isAuthenticate(uid, pass);
	}
	public User getUserById(String uid) {
		return this.userDao.getUserById(uid);
	}

	public boolean changePassword(User editUser) {
		return this.userDao.changePassword(editUser);
	}
}
