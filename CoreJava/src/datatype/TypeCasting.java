package datatype;

public class TypeCasting {
	/*
	 * -------------------- Type Casting -----------------------
	 * a) implicit type casting (auto casting)
	 * 	byte -> short -> int -> long -> float -> double (auto casting to high lvl{upgarde})
	 * 	
	 * b) explicit type casting (bye force)
	 * 	double -> float -> long -> int -> short -> byte -> char (degrade)
	 * 
	 * 
	 * syntax :
	 * 
	 * data_type var = (data_type) value
	 */
	
	public static void main(String[] args) {
		// implicit type casting
		int a = 386482;
		long k = a;
		
		// explicit type casting
		double x = 1123213.23123;
		float p = (float) x;
	}
}
