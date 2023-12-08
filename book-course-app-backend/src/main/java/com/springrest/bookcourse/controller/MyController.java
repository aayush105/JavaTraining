package com.springrest.bookcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bookcourse.model.Courses;
import com.springrest.bookcourse.service.CourseService;



@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class MyController {
	
	@Autowired
	public CourseService courseService;
	
	// get all the courses
	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
	
		return courseService.getCourses();
		
	}
	
	// get a single course by id
	@GetMapping("/courses/{id}")
	public Courses getCourse(@PathVariable int id) {
		
		return courseService.getCourseById(id);
	}
	
	// add a course
	@PostMapping("/courses/add")
	public String addCourse(@RequestBody Courses c) {
		courseService.addCourse(c);
		return "Add Success";
	}
	
	// update the course
	@PutMapping("/courses/update")
	public String updateCourse(@RequestBody Courses c) {
		courseService.updateCourse(c);
		return "Update Success";
	}
	
	// delete a course by id
	@DeleteMapping("/courses/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		
		courseService.deleteCourse(id);
		return "Delete Success";
	}
}
	
