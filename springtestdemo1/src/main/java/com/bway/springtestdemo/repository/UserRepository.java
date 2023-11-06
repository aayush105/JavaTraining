package com.bway.springtestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springtestdemo.model.User;

// < Model name, primary key(int) >
public interface UserRepository extends JpaRepository<User, Integer> {

	// method add for login
	User findByUsernameAndPassword(String un, String pswString);
	
}
