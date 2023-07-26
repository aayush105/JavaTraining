package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {
		add();
		
	}
	
	// add student
	
	static void add() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s = new Student();
		s.setFname("Aayush");
		s.setLname("Shrestha");
		s.setCollege("KEC");
		s.setAge(23);
		
		session.save(s); // insert sql
		session.getTransaction().commit(); //sql fire
		session.close();
	}
}
