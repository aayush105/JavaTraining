package controlstatements.looping;

public class JumpingTest {
	/*
	 * a) break; : exit from loop
	 * b) continue; : skip values
	 * c) return; : exit from method
	 * 
	 */
	
	public static void main(String[] args) {
		
		for ( int i= 1; i<=10; i++) {
			if(i == 5) {
				// break ; // don't print after 4 but print the "end for loop"
				// continue ; // skip 5 and print others
				return ; // don't print after 4 as well as "end for loop" as it return from the main method and dont go to the last sout
			}
			System.out.println(i);
		}
		System.out.println("----- End For Loop------"); 
	}
}
