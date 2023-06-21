package array;

import java.util.Scanner;

public class MultiDArray {
	
	
	/*
	 * ------------ MultiDArray --------------------
	 * # data managed in row and column format / matrix form.
	 * 
	 * syntax :
	 * 
	 * 	data_type  array_name[][] = new data_type[row][col];
	 * 
	 */
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		/*	   C0 C1
		 *  R0 [][]
		 * 	R1 [][]
		 * 
		 */
		
		// write data in matrix
		
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<2; i++) {
			
			for(int j = 0; j<2; j++) {
				System.out.print("Enter value ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		// read data from array
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}	
