package com.techlabs.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.dto.SubTaskDto;
import com.techlabs.model.User;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;

@Repository
public class SubTaskDao {
	@Autowired
	SessionFactory sessionFactory;

	public void save(SubTask subtask) {
		sessionFactory.getCurrentSession().save(subtask);
	}

	public void update(SubTask subtask) {
		sessionFactory.getCurrentSession().update(subtask);
	}

	public void delete(int subtaskId) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		SubTask subtask = (SubTask) sessionFactory.getCurrentSession().get(SubTask.class, subtaskId);
		session.delete(subtask);
		trans.commit();
		session.close();

	}

	public SubTask getSubTask(int subTask_id) {
		SubTask subtask = (SubTask) sessionFactory.getCurrentSession().get(
				SubTask.class, subTask_id);
		return subtask;
	}

	public List<SubTask> getSubTasks(int taskId) {
		Task task = (Task) sessionFactory.getCurrentSession().get(Task.class,
				taskId);
		System.out.println(task);
		@SuppressWarnings("unchecked")
		List<SubTask> subTasklist = (List<SubTask>) task.getSubtasks();
		Hibernate.initialize(subTasklist);
		return subTasklist;
	}

}
