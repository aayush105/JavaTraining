package com.bway.springpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springpractice.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
