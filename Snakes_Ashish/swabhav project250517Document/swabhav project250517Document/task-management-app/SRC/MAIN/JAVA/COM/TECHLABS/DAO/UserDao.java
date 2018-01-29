package com.techlabs.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.User;
import com.techlabs.model.UserLogin;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;

@Repository
public class UserDao {
	@Autowired
	SessionFactory sessionFactory;

	public void add(User employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public void update(int id, String empName, String dept, String email,
			int mobileNo) {
		User employee = (User) sessionFactory.getCurrentSession().get(User.class, id);
		employee.setDept(dept);

		employee.setName(empName);
		employee.setEmail(email);
		employee.setMobileno(mobileNo);
		System.out.println(employee);
	}

	public List<User> getEmployees() {
		@SuppressWarnings("unchecked")
		List<User> employeeList =sessionFactory.getCurrentSession().createCriteria(User.class)
				.list();

		return employeeList;
	}

	public User getUser(int userId) {
		User user = (User) sessionFactory.getCurrentSession().get(
				User.class, userId);
		Hibernate.initialize(user);
		return user;
	}

//	public void delete(User user) {
//		Session session = sessionFactory.openSession();
//		Transaction trans = session.beginTransaction();
//		// Employee employee = (Employee) session.get(Employee.class, emp_id);
//		System.out.println(user);
//		List<Task> taskList = user.getTasks();
//		Hibernate.initialize(taskList);
//		if (null != taskList) {
//			for (Task task : taskList) {
//				// Hibernate.initialize(task);
//				session.delete(task);
//				List<SubTask> subtaskList = task.getSubtasks();
//				Hibernate.initialize(subtaskList);
//				if (null != subtaskList) {
//					for (SubTask subtask : subtaskList) {
//						// Hibernate.initialize(subtask);
//						session.delete(subtask);
//					}
//				}
//			}
//		}
//		trans.commit();
//		session.close();
//
//	}


	public User getEmployee(String username) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User where username=?");
		query.setString(0, username);
		User user = (User) query.uniqueResult();
		return user;

	}

	public User getUserByMail(String mail) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User where email=?");
		query.setString(0, mail);
		User user = (User) query.uniqueResult();
		return user;
	}

}
