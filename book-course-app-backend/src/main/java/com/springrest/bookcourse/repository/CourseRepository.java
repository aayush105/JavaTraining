package com.springrest.bookcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.bookcourse.model.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer>{

}
