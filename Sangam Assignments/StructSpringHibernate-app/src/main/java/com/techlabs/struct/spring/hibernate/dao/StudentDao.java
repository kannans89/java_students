package com.techlabs.struct.spring.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.struct.spring.hibernate.entities.Student;

@Transactional
@Repository
public class StudentDao {
	@Autowired
	private SessionFactory factory;
	private Session session;

	public StudentDao() {
		System.out.println("dao object created");
	}

	public void createStudent(String name, int rollNo) {
		session = factory.getCurrentSession();
		Student student = new Student(name, rollNo);
		try {
			session.save(student);
			System.out.println("saved into db");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Student getStudent(int id) {
		session = factory.getCurrentSession();
		Student stud = (Student) session.get(Student.class, id);
		return stud;
	}

	@SuppressWarnings("unchecked")
	public List<Student> readStudentData() {
		session = factory.getCurrentSession();
		Query readQuery = session.createQuery("from Student");
		List<Student> studentlist = new ArrayList<Student>();
		studentlist = readQuery.list();
		return studentlist;
	}

	public void update(Student stud) {
		session = factory.getCurrentSession();
		Student student = (Student) session.get(Student.class, stud.getId());
		student.setName(stud.getName());
		student.setRollNo(stud.getRollNo());
		session.update(student);
	}

	public void delete(int id) {
		session = factory.getCurrentSession();
		session.delete(session.get(Student.class, id));
	}
}