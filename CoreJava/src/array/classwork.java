package array;

import java.util.Scanner;

public class classwork {
	
	/*
	 * Q) WAP to calculate total and average of 10 books.
	 *
	 */
	public static void main(String[] args) {
//		int total = 0;
//		int price[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i<price.length; i++) {
//			
//			System.out.println("Enter the price of book:");
//			
//			price[i] = sc.nextInt();
//			total += price[i];
//		}
//		int average = total/price.length;
//		System.out.println("Total price : "+ total);
//		System.out.println("Average price : "+ average);
		
		
		String sub[] = new String[3];
		int marks[] = new int[3];
		int total = 0;
		int percentage = 0;
		
		Scanner sc1 = new Scanner(System.in);
		for (int i= 0 ; i<sub.length; i++) {
			System.out.println("Enter the subject:");
			sub[i] = sc1.next();
			System.out.println("Enter the marks:");
			marks[i] = sc1.nextInt();
			
			total += marks[i];
		}
		percentage = (total/marks.length);
		System.out.println("--------------------------------");
		System.out.println("Subject ------------------- Marks");
		System.out.println("--------------------------------");
		for (int i= 0 ; i<sub.length; i++) {
			System.out.printf("| %-8s | %-8d |%n", sub[i], marks[i]);
			System.out.println("---------------------------");
		}
		System.out.printf("Total : | %-8d | %n", total);
		System.out.printf("Percentage : | %-8s | %n", percentage +"%");
//		System.out.printf("| %-8s | %-8d |%n", sub[0], marks[0]);
//		System.out.println("--------------------------------");
//		
//		System.out.printf("| %-8s | %-8d |%n", sub[1], marks[1]);
//		System.out.println("--------------------------------");
//		
//		System.out.printf("| %-8s | %-8d |%n", sub[2], marks[2]);
//		System.out.println("--------------------------------");

	}
	
	
}
