package com.techlabs.dao.subtask;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.dao.SubTaskDao;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;

@Repository
public class SubTaskDaoImp implements SubTaskDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public Set<SubTask> getSubTaskList(Task ownerTask) {
		return new HashSet<SubTask>(sessionFactory.getCurrentSession()
				.createSQLQuery("select * from sub_tasks where task_id = ?")
				.addEntity(SubTask.class)
				.setInteger(0, ownerTask.getTaskId()).list());
	}

	@Override
	public void addSubTaskToList(Task ownerTask, SubTask subTask) {
		subTask.setTaskOwner(ownerTask);
		sessionFactory.getCurrentSession().save(subTask);

	}

	@Override
	public void deleteSubTaskById(int subTaskId) {
		(sessionFactory.getCurrentSession()).delete(sessionFactory
				.getCurrentSession().get(SubTask.class, subTaskId));
	}

	@Override
	public SubTask getSubTaskById(Task ownerTask, int subTaskId) {
		return (SubTask) sessionFactory
				.getCurrentSession()
				.createSQLQuery(
						"select * from sub_tasks where task_id = ? and subtask_id = ?")
				.addEntity(SubTask.class)
				.setInteger(0, ownerTask.getTaskId())
				.setInteger(1, subTaskId).uniqueResult();
	}

	@Override
	public void updateSubTask(SubTask updateSubTask) {
		sessionFactory.getCurrentSession().update(updateSubTask);
	}

}
