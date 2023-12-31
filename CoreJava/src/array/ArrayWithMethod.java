package array;

import java.util.Arrays;

public class ArrayWithMethod {

	/*-------------- Array with method ------------------
	 * 
	 * a) Array as argument
	 * 
	 * 	void sum(int a[]){
	 * 
	 * }
	 * sum(array);
	 * 
	 * b) Array as return type
	 * 
	 * int[] get10IntValue(){
	 *  // array = 32,434,32,432,432,4,32;
	 * return array;
	 * }
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		int[] values = {23,241,42,412,44,14};
		add(values);
		int oddnum[] = getOddNumsFrom1TO100();
		System.out.println(Arrays.toString(oddnum)); // prints the array series 
		add(oddnum);
	}
	
	
	// ---------------- Array as Argument ------------------------
	static void add(int data[]) {
		int s = 0;
		for(int x : data) {
			s = s+ x;
		}
		System.out.println("Total : "+s);
	}
	
	// ------------------- Array as return type --------------------
	
	static int[] getOddNumsFrom1TO100 () {
		int oddNums[] = new int[50];
		int j = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2 != 0) {
				oddNums[j] = i;
				j++;
			}
		}
		return oddNums;
	}
	
}
