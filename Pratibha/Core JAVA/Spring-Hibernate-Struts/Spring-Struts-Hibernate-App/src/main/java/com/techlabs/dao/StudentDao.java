package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private SessionFactory factory;
	private Session session;
	private Student stud;
	List<Student> list;

	@SuppressWarnings("unchecked")
	public List<Student> get() {

		list = new ArrayList<Student>();
		session=factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		t.commit();
		for(Student s:list){
			System.out.println(s.getFirstname());
		}
		
		System.out.println(list.get(0).toString());
		System.out.println(list);
		return list;
	}

	public StudentDao() {
	}

	public void addStudent(Student student) {
		System.out.println("add");
		session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		session.save(student);
		t.commit();
		session.close();

	}

	public void deleteStud(int id) {
		System.out.println("del");
		session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		stud = (Student) session.get(Student.class, id);
		session.delete(stud);
		t.commit();
	session.close();
	}

	public Student getStudent(int id) {
		session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		stud = (Student) session.get(Student.class, id);
		
		t.commit();
	session.close();
		return stud;
	}

	public void editStudent(Student stud2) {
		session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		System.out.println("ID"+stud2.getId());
		System.out.println(stud2.getFirstname());
		stud = (Student) session.get(Student.class, stud2.getId());
		stud.setFirstname(stud2.getFirstname());
		stud.setLastname(stud2.getLastname());
		session.update(stud);
		t.commit();
		session.close();
		}

}
