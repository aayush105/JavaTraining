package com.bway.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "Employee Rest Api", version = "5.0", title = "API End Point"))
public class Springproject3pmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springproject3pmApplication.class, args);
	}

}
