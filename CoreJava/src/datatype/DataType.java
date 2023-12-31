package datatype;

public class DataType {
	/* ----------------- Data Type ---------------------------         
	 * # proper data representation
	 * # proper memory allocation
	 * # proper operation to be performed
	 * 
	 * # types :
	 *  1> primitive
	 *  	a> Byte
	 *  	b> Short
	 *  	c> int (default)
	 *  	d> Long
	 *  	e> Float
	 *  	f> double (default)
	 *  	g> Char
	 *  	h> Boolean
	 * 
	 *  
	 *  2> non-primitive
	 *  	a> String
	 *  	b> Array
	 *  	c> Collection
	 * 		d> Classes
	 * 		e> Enums
	 * 
	 * */
	
	public static void main(String[] args) {
		int a = 50000;
		long c = 5900000000000l; // l represent long ( l or L  can be written)
		
		double b = 1.2;
		float d = 1.2f; // (f can be written to represent floaat)
		
		System.out.println("byte = " +Byte.SIZE+ " " + Byte.MIN_VALUE+" "+ Byte.MAX_VALUE);
		System.out.println("short = " +Short.SIZE+ " " + Short.MIN_VALUE+" "+ Short.MAX_VALUE);
		System.out.println("int = " + Integer.SIZE+ " " + Integer.MIN_VALUE+" "+ Integer.MAX_VALUE);
		System.out.println("long = " +Long.SIZE+ " " + Long.MIN_VALUE+" "+ Long.MAX_VALUE);
		System.out.println("float = " +Float.SIZE+ " " + Float.MIN_VALUE+" "+ Float.MAX_VALUE);
		System.out.println("double = " +Double.SIZE+ " " + Double.MIN_VALUE+" "+ Double.MAX_VALUE);
		System.out.println("char = " + Character.SIZE+ " " + Character.MIN_VALUE+" "+ Character.MAX_VALUE);
		
	}
}
