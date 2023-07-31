package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("....teaching English");
		
	}

}
