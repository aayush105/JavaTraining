package array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// create array
		int age[] = new int[5];
		
		/*
		 * 0 1 2 3 4
		 * [20][][][]
		 * 
		 */
		// write array
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<age.length; i++) {
			System.out.println("Enter age");
			age[i] = sc.nextInt();
		}
	
		// read array
		for (int x : age) {
			System.out.println(x);
		}
	}
}
