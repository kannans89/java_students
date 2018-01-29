package com.techlabs.entity.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techlabs.entity.Exhibition;
import com.techlabs.entity.Organizer;
import com.techlabs.hibernate.util.HibernateUtil;

public class TestMain {

	public static void main(String[] args) {
		Organizer organizer = new Organizer("Mayur", 122193);
		Set<Exhibition> exhList = new HashSet<Exhibition>();
		Exhibition e1 = new Exhibition("ABC", "Andheri");
		e1.setOrganizer(organizer);
		
		Exhibition e2 = new Exhibition("DCB", "Pune");
		e2.setOrganizer(organizer);
		exhList.add(e1);
		exhList.add(e2);
		organizer.setList(exhList);
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		session.save(organizer);
		Organizer organizer2 = (Organizer) session.get(Organizer.class, 1);
		System.out.println(organizer2.getList());
		tx.commit();
		session.close();
		System.out.println("End of Main");
	}
}
