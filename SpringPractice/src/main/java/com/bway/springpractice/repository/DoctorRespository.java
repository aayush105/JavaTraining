package com.bway.springpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springpractice.model.Doctor;

public interface DoctorRespository extends JpaRepository<Doctor, Integer>{

}
