package array;

import java.util.Scanner;

public class classwork {
	
	/*
	 * Q) WAP to calculate total and average of 10 books.
	 *
	 */
	public static void main(String[] args) {
		int total = 0;
		int price[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<price.length; i++) {
			
			System.out.println("Enter the price of book:");
			
			price[i] = sc.nextInt();
			total += price[i];
		}
		int average = total/price.length;
		System.out.println("Total price : "+ total);
		System.out.println("Average price : "+ average);
		
		
		String sub[] = new String[3];
		int marks[] = new int[3];
		Scanner sc1 = new Scanner(System.in);
		for (int i= 0 ; i<sub.length; i++) {
			
		}
		
	}
	
	
}
