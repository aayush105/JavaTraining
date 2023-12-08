package com.springrest.bookcourse.service;

import java.util.List;

import com.springrest.bookcourse.model.Courses;

public interface CourseService {

	List<Courses> getCourses();
	
	Courses getCourseById(int id);

	void addCourse(Courses c);

	void updateCourse(Courses c);

	void deleteCourse(int id);
	
	
}
