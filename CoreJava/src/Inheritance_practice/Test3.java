package Inheritance_practice;

public class Test3 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Ram";
		e.age = 21;
		e.address = "Ktm";
		e.number = 9887613211l;
		e.salary = 200000;
		e.specialization = "coder";
		e.dept = "coding";
		
		
		Manager m = new Manager();	
		m.name = "Shyam";
		m.age = 22;
		m.address = "Ktm";
		m.number = 577613211l;
		m.salary = 100000;
		m.specialization = "Managing director";
		m.dept = "Head dept";
		
		System.out.println("----- Employee's Data ------");
		e.print();
		e.printSalary();
		System.out.println("----- Manager's Data ------");
		m.print();
		m.printSalary();
		}
	
}
