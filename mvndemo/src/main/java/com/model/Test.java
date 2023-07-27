package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {

	
	public static void main(String[] args) {
		// add();
//		 getAll();
//		update();
//		delete();
		hqlTest();
	}
	
	// add student
	
	static void add() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s = new Student();
		s.setFname("Rupa");
		s.setLname("Basnet");
		s.setCollege("NCC");
		s.setAge(24);
		
		session.save(s); // insert sql
		session.getTransaction().commit(); //sql fire
		session.close();
	}
	
	static void getAll() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria crt = session.createCriteria(Student.class);
//		crt.add(Restrictions.eq("college", "KEC")); // condition
//		crt.add(Restrictions.ge("age", 23)); // condition

		
		
		List<Student> slist = crt.list(); // select sql
		System.out.println(slist);
		
	}
	
	static void update() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s = (Student) session.get(Student.class,3);
		
				s.setAge(24);
				session.update(s);
				session.getTransaction().commit();
				session.close();
	}
	
	static void delete() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Student s = (Student) session.get(Student.class,6);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
	}
	
	//HQL -> Hibernate Query Language
	
	static void hqlTest() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Query hql = session.createQuery("FROM Student");
		
		List<Student> slist = hql.list();  // select sql
		System.out.println(slist);
		
	}
}
