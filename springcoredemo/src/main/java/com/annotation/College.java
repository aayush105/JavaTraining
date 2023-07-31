package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "Colz")
public class College {

	@Value("KEC")
	private String name;
	@Value("012345")
	private String phone;
	
	@Autowired //bean injection with HAS-A relationship
	private Student s;
	
	@Autowired
	 @Qualifier("englishTeacherServiceImpl")
	private TeacherService ts;
	
	void printCollege() {
		
		System.out.println("College name = "+name);
		System.out.println("Phone = "+phone);
		
		s.printStudent();
		ts.teach();
	}
	
}
