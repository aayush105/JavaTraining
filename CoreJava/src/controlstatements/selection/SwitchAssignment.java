package controlstatements.selection;

import java.util.Scanner;

public class SwitchAssignment {
	
	
	public static void main(String[] args) {
		int salary ;
		double total_salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your post : ");
	 	String post = sc.nextLine();
		
		switch (post) {
		case "MD" :
			salary = 359000;
			total_salary = salary + salary * 0.2067;
			System.out.println("Your Total salary is " + total_salary);
			break ;
		
		case "CEO" :
		salary = 234000;
		total_salary = salary + salary* 0.18;
		System.out.println("Your Total salary is " + total_salary);
		break;
		
		case "MANAGER" :
		salary = 187000;
		total_salary = salary + salary* 0.1788;
		System.out.println("Your Total salary is " + total_salary);
		break;
		
		case "HELPER" :
		salary = 127809;
		total_salary = salary + salary* 0.11;
		System.out.println("Your Total salary is " + total_salary);
		break;
	}
	}
}
