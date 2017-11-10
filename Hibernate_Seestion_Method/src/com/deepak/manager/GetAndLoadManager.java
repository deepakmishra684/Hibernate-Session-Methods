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
public class GetAndLoadManager {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("First We calling load() method");
		Student stu = (Student) session.load(Student.class, 111);
		System.out.println(stu.getClass());
		
		System.out.println("Second We calling get() method");
		stu = (Student) session.get(Student.class, 111);
		System.out.println(stu.getClass());

		tx.commit();
		session.close();
		
		System.out.println("================================");
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();

		System.out.println("First We calling get() method");
		stu = (Student) session.get(Student.class, 111);
		System.out.println(stu.getClass());
 
		System.out.println("Srcond We calling load() method");
		stu = (Student) session.load(Student.class, 111);
		System.out.println(stu.getClass());

		tx.commit();
		session.close();
	}
}
