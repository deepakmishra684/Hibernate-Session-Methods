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
public class SaveMethodManager {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st=new Student();
		st.setId(111);
		st.setName("Deepak Mishra");
		st.setCity("Lucknow");
		int id=(int)session.save(st);
	
		tx.commit();
		System.out.println("Student record save in database with id :: "+id);
	}
}
