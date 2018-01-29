package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
		double checkOut = 5000;
		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.createSQLQuery(
					"update users set user_balance = user_balance - "
							+ checkOut + "  where user_id = '1'")
					.executeUpdate();
			session.createSQLQuery(
					"update vendors set vendor_balance = vendor_balance + "
							+ checkOut + " where vendor_id = '101'")
					.executeUpdate();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
		System.out.println("End of main");
	}

}
