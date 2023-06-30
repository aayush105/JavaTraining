package Inheritance_practice;

public class Manager extends Member {
	
	String specialization;
	String dept;
	
	void print() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+age);
		System.out.println("Phone number: "+number);
		System.out.println("Address: "+address);
		System.out.println("Specialization: "+specialization);
		System.out.println("Department: "+dept);
		
	}
}
