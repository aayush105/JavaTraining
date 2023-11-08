package com.bway.springproject.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Null ko sato Auto dekhinxa db ma
	private int id;
	private String dept_name;
	private String dept_head;
	private String dept_phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_head() {
		return dept_head;
	}

	public void setDept_head(String dept_head) {
		this.dept_head = dept_head;
	}

	public String getDept_phone() {
		return dept_phone;
	}

	public void setDept_phone(String dept_phone) {
		this.dept_phone = dept_phone;
	}

}
