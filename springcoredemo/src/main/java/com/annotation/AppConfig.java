package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // starts spring container
@ComponentScan(basePackages = "com.annotation")
public class AppConfig {

	@Bean(name = "std")
	//@Scope("singleton") // only 1 object
	@Scope("prototype") //multiple object
	public Student getStudentBean() {
		
		return new Student();
	}
	
}
