package datatype;

public class WrapperTest {
	
	/* --------------- Wrapper Class -------------
	 * # every primitive data type has their respective class is known as wrapper class.
	 * 
	 * Primitive Type		Wrapper class
	 * ---------------		---------------
	 * 	byte				Byte
	 *  short				Short
	 *  int					Interger
	 *  long				Long
	 *  float				Float
	 *  chat 				Character
	 *  boolean 			Boolean
	 *  
	 * */
	
	public static void main(String[] args) {
		
		// "k" is variable only
		int k = 5000;
		
		// "p" is variable and object 
		Integer p = 9000;
		
		/*
		 *  # Auto-Boxing
		 *  -> conversion of primitive type to wrapper type.
		 */
		
		int a = 232;
		Integer b = a; // auto-boxing
		
		/*
		 *  # Auto-UnBoxing
		 *  -> conversion of wrapper type to  primitive type .
		 */
		
		Double x = 21323.21312;
		double y = x; // auto-UnBoxing
		
		System.out.println(Integer.toBinaryString(800));
		System.out.println(Integer.toOctalString(800));
		System.out.println(Integer.toHexString(800));
		
	}
	
}
