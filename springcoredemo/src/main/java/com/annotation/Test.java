package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		College c = (College) context.getBean("Colz");
//		c.printCollege();
		
		Student s = (Student) context.getBean("std", Student.class);
//		s.printStudent();
		System.out.println(s);
		Student s1 = (Student) context.getBean("std", Student.class);
		System.out.println(s1);
	}
}
