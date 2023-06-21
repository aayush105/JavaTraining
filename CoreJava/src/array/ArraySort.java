package array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] values = {1,24,33,54,33,65,4,45,73};
		
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		System.out.println("------ Reverse ----------");
		
		for ( int i = values.length-1; i>=0; i--) {
			System.out.print(values[i]+" ");
		}
	}
	
}
