package controlstatements.selection;

public class IfTest {

	/*
	 * ------------------------- if -------------------------------------
	 * # use to implement single condition
	 * 
	 * 
	 * syntax:
	 * if(condition){
	 *  // statements
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		int salary = 80000;
		
		if(salary < 30000) {
			salary = salary + 8000;
		}
		
		System.out.println("Your total salary = " + salary);
		
	}
	
}

