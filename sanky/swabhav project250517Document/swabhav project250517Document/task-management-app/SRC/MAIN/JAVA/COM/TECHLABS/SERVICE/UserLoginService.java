package com.techlabs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.dao.UserLoginDao;
import com.techlabs.dto.UserLoginDto;
import com.techlabs.model.UserLogin;

@Service
public class UserLoginService {
	@Autowired
	private UserLoginDao userLoginDao;

	public UserLoginService() {

	}

	@Transactional
	public void addUser(UserLoginDto userLoginDto) {
		UserLogin user = new UserLogin(userLoginDto.getUsername(),
				userLoginDto.getPassword());
		userLoginDao.addUser(user);
	}

	@Transactional
	public void updatePassword(UserLoginDto userLoginDto) {
		UserLogin user = userLoginDao.getByUsername(userLoginDto
				.getUsername());
		user.setUsername(userLoginDto.getUsername());
		user.setPassword(userLoginDto.getPassword());
		userLoginDao.updatePassword(user);

	}

	@Transactional
	public List<UserLogin> getUsers(UserLoginDto userLoginDto) {
		return userLoginDao.getUsers();
	}

	@Transactional
	public UserLogin authenticateUser(UserLoginDto userLoginDto) {
				return userLoginDao.getUser(userLoginDto.getUsername(),
				userLoginDto.getPassword());
	}

	@Transactional
	public UserLogin checkUsername(UserLoginDto userLoginDto) {
		return userLoginDao.getByUsername(userLoginDto.getUsername());
	}

}
