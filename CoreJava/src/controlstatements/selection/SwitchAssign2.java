package controlstatements.selection;

import java.util.Scanner;

public class SwitchAssign2 {

	public static void main(String[] args) {
		int a , b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first numbers : ");
	 	a = sc.nextInt();
	 	System.out.println("Enter your first numbers : ");
	 	b = sc.nextInt();
	 	System.out.println("Enter operator ' + | - | / | * : ");
	 	String operator = sc.next();
		int c;
		
		switch (operator) {
	
		case "+" :
			c = a + b;
			System.out.println(c);
			break;
		case "-" :
			c = a - b;
			System.out.println(c);
			break;
		case "/" :
			c = a / b;
			System.out.println(c);
			break;
		case "*" :
			c = a * b;
			System.out.println(c);
			break;
		}
	}
}
