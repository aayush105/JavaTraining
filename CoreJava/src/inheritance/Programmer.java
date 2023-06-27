package inheritance;

public class Programmer extends Employee{

	String progLang;
	String project;
	int bonus;
	
	void print() {
		super.print(); // "super" is used to denote the parent class 
		System.out.println("Programming Language : "+ progLang);
		System.out.println("Project : "+ project);
		System.out.println("Bonus : "+ bonus);
	}
}
