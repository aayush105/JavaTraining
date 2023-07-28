package com.di;

public class Student {

	private int id;
	private String name;
	private String college;
	private Bike bike;
	
	
	public int getId() {
		return id;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", bike=" + bike + "]";
	}
	
	
}
