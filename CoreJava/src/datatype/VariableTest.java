package datatype;

import java.util.Scanner;

public class VariableTest {
	
	/*
	 * --------------- Variable --------------------
	 * # use to store value.
	 * # value stored for processing.
	 * 
	 * syntax :
	 *  data_type variable;
	 *  
	 */
	
	public static void main(String[] args) {
		
		/*
		 * default value assignment
		 
		int a = 500;
		int b = 900;
		
		
		
		int c = a + b;
		System.out.println("Total : " + c); // "+" concatenation : information adding
		
		*/
		 
		int a ;
		int b;
		
		Scanner sc = new Scanner(System.in); // used for taking input which is assigned to the sc and that can be further used for the various operation
		
		System.out.println("Enter value of a ");
		a = sc.nextInt(); // to read the data from keyboard
		
		System.out.println("Enter value of b ");
		b = sc.nextInt(); // to read the data from keyboard
		
		
		int c = a + b;
		System.out.println("Total : " + c); // "+" concatenation : information adding
	}
}
