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
public class UpdateAndMerge {
	/**
	 * We can use update() method to update record within session But We can use
	 * merge() method with same session or other session doesn't matter
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		/*------------Merge------------------------*/
		Student stu = (Student) session.get(Student.class, 111);
		session.close();// after closing session we are updating record
		stu.setName("Deeepak Kumar");

		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(stu);
		tx.commit();
		session.close();
		
		System.out.println("******************************************************");
		
		/*----------------------Update-------------------------*/
		session = sessionFactory.openSession();
		Student stu1 = (Student) session.load(Student.class, 111);
		session.close();// after closing session we are updating record
		stu1.setName("Mayaati sss");
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(stu1);
		tx.commit();
		session.close();
	}
}
