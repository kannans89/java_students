package com.techlabs.dao.task;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.dao.TaskDao;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Repository
public class TaskDaoImp implements TaskDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public Set<Task> getTaskList(User owner) {

		return new HashSet<Task>( sessionFactory.getCurrentSession()
				.createSQLQuery("select * from tasks where tasks.user_name=?")
				.addEntity(Task.class)
				.setString(0, owner.getUserName()).list());
	}

	@Override
	public void addTaskToList(User owner, Task task) {
		task.setOwner(owner);
		sessionFactory.getCurrentSession().save(task);

	}

	@Override
	public void deleteTaskById(int taskId) {
		(sessionFactory.getCurrentSession()).delete(sessionFactory
				.getCurrentSession().get(Task.class, taskId));
	}

	@Override
	public Task getTaskById(User owner, int taskId) {
		return (Task) sessionFactory.getCurrentSession()
				.createSQLQuery("select * from tasks where user_name = ? and task_id = ?")
				.addEntity(Task.class)
				.setString(0, owner.getUserName())
				.setInteger(1, taskId)
				.uniqueResult();
	}

	@Override
	public void updateTask(Task updateTask) {
		sessionFactory.getCurrentSession().update(updateTask);
	}

}
