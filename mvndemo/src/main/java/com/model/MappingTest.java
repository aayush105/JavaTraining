package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class MappingTest {

	public static void main(String[] args) {
//		oneToone();
//		oneTomany();
		manyTomany();
	}
	
	//one to one mapping
	
	static void oneToone() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Address adr = new Address();
		adr.setCountry("Nepal");
		adr.setCity("Pokhara");
		adr.setState("Gandaki");
		
		session.save(adr);
		
		Employee emp = new Employee();
		emp.setName("Aayush Stha");
		emp.setSalary(88000);
		emp.setEmail("a@gmail.com");
		emp.setAddress(adr);
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
	
	//one to many mapping
	
		static void oneTomany() {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			Address adr = new Address();
			adr.setCountry("Nepal");
			adr.setCity("Pokhara");
			adr.setState("Gandaki");
			session.save(adr);
			
			Employee emp = new Employee();
			emp.setName("Aayush Stha");
			emp.setSalary(88000);
			emp.setEmail("a@gmail.com");
			emp.setAddress(adr);
			
			Phone p1 = new Phone();
			p1.setNumber("89798234983");
			p1.setType("NTC");
			p1.setEmployee(emp);
			session.save(p1);
			
			Phone p2 = new Phone();
			p2.setNumber("0979823");
			p2.setType("NCELL");
			p2.setEmployee(emp);
			session.save(p2);
			
			emp.setPhones(Arrays.asList(p1,p2));
			
			session.save(emp);
			session.getTransaction().commit();
			session.close();
		}
		
		// many to many mapping
		static void manyTomany() {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			Address adr = new Address();
			adr.setCountry("Nepal");
			adr.setCity("Pokhara");
			adr.setState("Gandaki");
			session.save(adr);
			
			Employee emp = new Employee();
			emp.setName("Aayush Stha");
			emp.setSalary(88000);
			emp.setEmail("a@gmail.com");
			emp.setAddress(adr);
			
			Phone p1 = new Phone();
			p1.setNumber("89798234983");
			p1.setType("NTC");
			p1.setEmployee(emp);
			session.save(p1);
			
			Phone p2 = new Phone();
			p2.setNumber("0979823");
			p2.setType("NCELL");
			p2.setEmployee(emp);
			session.save(p2);
			
			Department d1 = new Department();
			d1.setDeptName("Admin");
			session.save(d1);
			
			Department d2 = new Department();
			d2.setDeptName("IT");
			session.save(d2);
			
			
			emp.setDeptList(Arrays.asList(d1,d2));
			emp.setPhones(Arrays.asList(p1,p2));
			
			session.save(emp);
			session.getTransaction().commit();
			session.close();
			
			
		}
}
