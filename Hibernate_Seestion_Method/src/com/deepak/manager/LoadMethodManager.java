package com.deepak.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.deepak.dbManager.HibernateUtil;
import com.deepak.model.Student;

/**
 * @author deepak
 *
 */
public class LoadMethodManager {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("We calling load() method");
		Student stu = (Student) session.load(Student.class, 111);
		System.out.println("We called load() method");
		stu.getId();
		stu.getName();
		stu.getCity();
		System.out.println(stu.toString());
		tx.commit();
	    session.close();
	}
}
