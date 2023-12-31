package objectwitharray;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] emp = getEmployeeData();
		print(emp);
	}
	private static Employee[] getEmployeeData() {
		Employee[] emp = new Employee[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<emp.length; i++) {
			Employee e = new Employee();
			System.out.println("Enter the emp id :");
			e.setId(sc.nextInt());
			System.out.println("Enter the name: ");
			e.setName(sc.next());
			System.out.println("Enter the company name: ");
			e.setCompany(sc.next());
			System.out.println("Enter the salary: ");
			e.setSalary(sc.nextInt());
			emp[i] = e;
		}
		
		return emp;
	}
	private static void print(Employee[] emp) {
		EmployeeTest t = new EmployeeTest();
		for (int i = 0; i < emp.length; i++) {
			t.printData(emp[i]);
			System.out.println("------------------------");
			
		}
	}
	void printData(Employee emp) {
		System.out.println("ID : "+ emp.getId());
		System.out.println("Name : "+ emp.getName());
		System.out.println("Company Name : "+ emp.getCompany());
		System.out.println("Salary : "+ emp.getSalary());
	}
	
}
