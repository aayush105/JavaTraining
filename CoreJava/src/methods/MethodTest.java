package methods;

public class MethodTest {
	public static void main(String[] args) {
//		sum();
//		printTable(9);
		int s = getSumOf1to100();
		System.out.println("Total sum : "+ s );
		
		int x = findSmallestValue(19,10);
		System.out.println("Smallest : "+ x );
	}
	
	// 1) no return type with no argument
	
	static void sum() {
		int a = 6;
		int b = 9;
		int c = a + b;
		System.out.println("Result : "+ c);
	}
	
	// 2) no return type with argument
	
	static void printTable(int n) {
		for (int i =1; i<=10 ; i++) {
			System.out.println(n+" x "+i+" = "+ (n*i));
		}
	}
	
	// 3) return type with no argument
	
	static int getSumOf1to100() {
		int s = 0;
		for (int i = 1; i<=100; i++) {
			s = s + i;
		}
		return s;
	}
	
	// 4) return type with arguments
	
	static int findSmallestValue(int x, int y) {
		if(x<y) {
			return x;
		} 
		return y;
	}
	
	/*
	 *  Q) find area and volumes as:
	 *  	a) getArea:
	 *  	-> pass l and b as a parameter
	 *  	-> calculate area
	 *  	-> return area
	 *  	-> call this method in main
	 *  
	 *  	b) volume:
	 *  	-> pass area and height as parameter
	 *  	-> calculate volume
	 *  	-> print area
	 *  	-> print volume
	 *  	-> call this method in main
	 * 
	 */
			
}
