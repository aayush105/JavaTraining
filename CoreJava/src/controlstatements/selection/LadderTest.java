package controlstatements.selection;

public class LadderTest {

	/* --------------------- if else ladder(else if) -----------------------
	 * syntax :
	 * 
	 * if(condition-1) {
	 *   //statement
	 * } else if (condition-2) {
	 * 	// statements	
	 * } else if (condition-3){
	 * 	// statements	
	 * } else {
	 * // statements	
	 * 	 }
	 */
	
	public static void main(String[] args) {
		int marks = 83;
		if(marks >= 80) {
			System.out.println("Distinction");
		} else if (marks >= 60) {
			System.out.println("First Division");
		} else if (marks >= 45) {
			System.out.println("Second Division");
		} else if (marks >= 32) {
			System.out.println("Third Division");
		} else {
			System.out.println("Fail");
		}
	}
}
