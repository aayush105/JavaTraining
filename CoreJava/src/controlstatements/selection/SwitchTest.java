package controlstatements.selection;

public class SwitchTest {

	/* ------------- Switch ----------------------
	 * syntax :
	 * 
	 * switch(variable){
	 * 	case 1 :
	 * 	//statement
	 * 	break;
	 * 
	 * case 2 :
	 * 	//statement
	 * 	break;
	 * 
	 * case 3 :
	 * 	//statement
	 * 	break;
	 * 
	 * .........
	 * 
	 * default :
	 *  // statement
	 *  }
	 */
	
	public static void main(String[] args) {
		int day = 3;
		switch(day) {
		case 1 :
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wednesday");
			break;
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturday");
			break;
	
		default :
			System.out.println("invalid");
		}
	}
}
