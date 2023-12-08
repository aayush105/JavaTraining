package com.springrest.bookcourse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bookcourse.model.Courses;
import com.springrest.bookcourse.repository.CourseRepository;
import com.springrest.bookcourse.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	public CourseRepository courseRepo;
	
	@Override
	public List<Courses> getCourses() {
		
		return courseRepo.findAll();
	}

	@Override
	public Courses getCourseById(int id) {
		
		return courseRepo.findById(id).get();
	}

	@Override
	public void addCourse(Courses c) {
		courseRepo.save(c);
		
	}

	@Override
	public void updateCourse(Courses c) {
		courseRepo.save(c);
		
	}

	@Override
	public void deleteCourse(int id) {
		courseRepo.deleteById(id);
		
	}


	

}
