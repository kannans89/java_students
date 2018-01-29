package com.techlabs.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.techlabs.entity.User;

@Repository
public interface UserDao {

	public Set<User> getUserList();

	public boolean isValidUser(String userName, String password);

	public User getUserById(String userName);

	public void changePassword(User editUser);
}
