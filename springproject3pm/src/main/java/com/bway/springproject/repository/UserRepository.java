package com.bway.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//this method is created for login using email and password
	User findByEmailAndPassword(String email, String psw); 
}
