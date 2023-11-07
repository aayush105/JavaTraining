package com.bway.springPractice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springPractice1.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	
	

}
