package com.bway.springPractice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springPractice1.model.Patient;

public interface PatientRepository  extends JpaRepository<Patient, Integer>{

}
