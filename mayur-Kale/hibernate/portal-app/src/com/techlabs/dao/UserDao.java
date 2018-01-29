package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techlabs.entity.User;
import com.techlabs.hibernate.util.HibernateUtil;

public class UserDao {

	public List<User> getUserList() {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		List<User> userList = new ArrayList<User>();
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createSQLQuery("select * from users")
					.addEntity(User.class);
			userList = query.list();
			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return userList;

	}

	public boolean isAuthenticate(String uid, String pass) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		boolean result = false;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createSQLQuery(
					"select * from users where uid=? and password=?")
					.addEntity(User.class);
			query.setString(0, uid);
			query.setString(1, pass);
			User user = (User) query.uniqueResult();
			tx.commit();
			if (user != null)
				result = true;
			else
				result = false;

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	public User getUserById(String uid) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		User userResult = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			userResult = (User) session.get(User.class, uid);

			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return userResult;

	}

	public boolean changePassword(User editUser) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.update(editUser);
			tx.commit();
			result = true;
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
		return result;
	}
}
