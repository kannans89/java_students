package com.techlabs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.User;
import com.techlabs.model.UserLogin;

@Repository
public class UserLoginDao {
	@Autowired
	SessionFactory sessionFactory;

	public void addUser(UserLogin user) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(user);
		trans.commit();
		session.close();
	}

	public void updatePassword(UserLogin user) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(user);
		trans.commit();
		session.close();

	}

	public UserLogin get(int userId) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		UserLogin user = (UserLogin) session.get(UserLogin.class,
				userId);
		trans.commit();
		session.close();
		return user;
	}

	public List<UserLogin> getUsers() {
		@SuppressWarnings("unchecked")
		List<UserLogin> users = sessionFactory.getCurrentSession().createCriteria(UserLogin.class)
				.list();
		return users;

	}

	public UserLogin getByUsername(String username) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from UserLogin where username=?");
		query.setString(0, username);
		UserLogin user = (UserLogin) query.uniqueResult();
		return user;

	}

	public UserLogin getUser(String username, String password) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from UserLogin where username=? and password=?");
		query.setString(0, username);
		query.setString(1, password);
		UserLogin user = (UserLogin) query.uniqueResult();
		return user;

	}

}
