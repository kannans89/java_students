package com.techlabs.dao.user;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.dao.UserDao;
import com.techlabs.entity.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public Set<User> getUserList() {

		return new HashSet<User>(sessionFactory.getCurrentSession()
				.createSQLQuery("select * from users").addEntity(User.class)
				.list());
	}

	@Override
	public boolean isValidUser(String userName, String password) {
		if (sessionFactory
				.getCurrentSession()
				.createSQLQuery(
						"select * from users where user_name = ? and user_password = ?")
				.addEntity(User.class).setString(0, userName)
				.setString(1, password).uniqueResult() != null)
			return true;

		return false;
	}

	@Override
	public User getUserById(String userName) {
		return (User) sessionFactory.getCurrentSession()
				.createSQLQuery("select * from users where user_name = ?")
				.addEntity(User.class).setString(0, userName).uniqueResult();
	}

	@Override
	public void changePassword(User editUser) {
		sessionFactory.getCurrentSession().update(editUser);
	}

}
