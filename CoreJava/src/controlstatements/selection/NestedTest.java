package controlstatements.selection;

public class NestedTest {
	/*
	 * ------------------------- Nested ----------------------------
	 * syntax :
	 * if( condition-1){
	 * 	if(condition-2){
	 * 		if(condition-3){
	 * 		// statements
	 * 		
	 * 		} else {
	 * 	
	 * 		} else {
	 * 	
	 * 		} else {
	 * 
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 35;
		
		// to compare string "equals" is used
		if(citizen.equals("nepali")) {
			
			if (age >= 18) {
				System.out.println("You can vote.");
			} else {
				System.out.println("You are under age.");
			}
			
		} else {
			System.out.println("invalid citizenship!!!");
		}
	}
}
