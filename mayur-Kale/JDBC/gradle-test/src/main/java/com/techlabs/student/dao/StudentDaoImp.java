package com.techlabs.student.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentDaoImp implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> getStudentList() {
		// TODO Auto-generated method stub

		Query query = sessionFactory.getCurrentSession()
				.createSQLQuery("select * from students")
				.addEntity(Student.class);
		return query.list();
	}

	public void addStudentToList(Student student) {
		if (isExistStudent(student.getRollNo()))
			return;

		sessionFactory.getCurrentSession().save(student);
	}

	public boolean isExistStudent(int rollNo) {
		boolean result = false;

		if (sessionFactory.getCurrentSession().get(Student.class, rollNo) != null)
			result = true;
		else
			result = false;

		return result;

	}

	public Student getStudentByRollNo(int rollNo) {

		return (Student) sessionFactory.getCurrentSession().get(Student.class,
				rollNo);

	}

	public void updateStudent(int rollNo, Student updateStudent) {
		sessionFactory.getCurrentSession().update(updateStudent);

	}

	public void deleteStudentByRollNo(int rollNo) {
		Session session =sessionFactory.getCurrentSession();
		session.delete(
				session.get(Student.class, rollNo));
		

	}

}
