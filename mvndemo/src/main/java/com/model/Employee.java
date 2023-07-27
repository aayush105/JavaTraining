package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id @GeneratedValue
	private int id;
	private String name;
	private String email;
	private int salary;
	
	@OneToOne
	@JoinColumn(name="adrID")
	private Address address;
	
	@OneToMany(mappedBy =  "employee")
	private List<Phone>  phones;
	 
	@ManyToMany
	@JoinTable(name = "emp_dept_tbl", joinColumns = {@JoinColumn(name="empId")}, inverseJoinColumns = {@JoinColumn(name="deptId")})
	private List<Department> deptList;
	
	
	
	public List<Department> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}
	public int getId() {
		return id;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
