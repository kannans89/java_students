package com.techlabs.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
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
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;

@Repository
public class TaskDao {
	@Autowired
	SessionFactory sessionFactory;

	public void save(Task task) {
		sessionFactory.getCurrentSession().save(task);
	}

	public void update(Task task) {
		sessionFactory.getCurrentSession().update(task);
	}

	public void delete(int taskId) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		Serializable id = new Integer(taskId);
		Object persistanceInstance = session.load(Task.class, id);
		if (persistanceInstance != null) {
			session.delete(persistanceInstance);
		}

		trans.commit();
		session.close();
	}

	public Task getTask(int task_id) {
		Task task = (Task) sessionFactory.getCurrentSession().get(Task.class, task_id);
		Hibernate.initialize(task);
		return task;

	}

	public List<Task> getUserTasks(int userId) {
		User user = (User) sessionFactory.getCurrentSession().get(
				User.class, userId);
		System.out.println(user);
		@SuppressWarnings("unchecked")
		List<Task> tasklist = (List<Task>) user.getTasks();
		Hibernate.initialize(tasklist);
		return tasklist;
	}

	public List<SubTask> getSubTasks(Task userTask) {
		Task task = (Task) sessionFactory.getCurrentSession().get(Task.class,
				userTask.getTask_id());
		List<SubTask> subTasklist = (List<SubTask>) task.getSubtasks();
		return subTasklist;
	}

	public List<Task> getAllTasks(User user) {
		User newUser = (User) sessionFactory.getCurrentSession().get(
				User.class, user.getId());
		List<Task> taskList = newUser.getTasks();
		System.out.println(taskList);
		return taskList;
	}

}
